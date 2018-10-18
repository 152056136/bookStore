package com.nsc.web.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nsc.backend.entity.Address;
import com.nsc.backend.entity.Cart;
import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.TradeTable;
import com.nsc.backend.entity.User;
import com.nsc.backend.service.IAddressService;
import com.nsc.backend.service.ICartService;
import com.nsc.backend.service.IOrderBaseService;
import com.nsc.backend.service.IUserService;


@Controller
@RequestMapping("/orderBase")
public class OrderBaseController {

	@Autowired
	private IOrderBaseService orderBaseServiceImpl;
	@Autowired
	private IUserService 	userServiceImpl;
	@Autowired
	private ICartService cartServiceImpl;
	@Autowired
	private IAddressService addressServiceImpl;
	/**
	 * 批量提交购物车
	 * @param openId  
	 * @param cartList
	 * @param addId  用户选择的地址
	 * @param order_reightRisk	订单运费险		
	 * @param note	备注	
	 */
	@RequestMapping("/addToOrderBase")
	@ResponseBody
	public String addToOrderBase(@RequestBody String cartpara) {
		//根据cartId集合将cart信息查询出来，封装进order订单
		String paralist ="{\"openId\":\"o_1QS0TEoGebWrlHCxz-bzokvyj0\","
				+ "\"cartList\":[{\"cartId\":55},{\"cartId\":57},{\"cartId\":58}]，"
				+ "\"addId\":\"84\","
				+ "\"order_reightRisk\":\"3.3\","
				+ "\"note\":\"斯蒂芬数量大幅\"}";
		System.out.println("cartpara==="+cartpara);
		JSONObject json = JSONObject.parseObject(cartpara);
		JSONArray arr = (JSONArray) json.get("cartList");
		String openId = (String) json.get("openId");
		Integer addId = (Integer) json.get("addId");
		Double order_reightRisk = (Double) json.get("order_reightRisk");
		String note = (String) json.get("note");
		
		//生成jsonArray解析为list
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.size();i++) {
			JSONObject jsonObject = arr.getJSONObject(i);
			list.add(jsonObject.getInteger("cartId"));
		}
		//根据cartId的list集合将cart集合查出来
		List<Cart> clist = cartServiceImpl.findCartByList(list);
		
		//保存订单的相关详情，并返回orderId主键，进行保存订单项
		User user = userServiceImpl.findUserByopenId(openId);
		System.out.println(user.toString());
		Address address = addressServiceImpl.findAddressById(83);
		
		
		
		//生成交易
		TradeTable trade = new TradeTable();
		trade.setTradetableMethod(1);//tradeTable_method	支付方式	Int 	Not null	1:微信支付；2:支付宝支付
		//3:银行卡支付
		//4：其他
		trade.setTradetableNumber(orderBaseServiceImpl.getRandom(6));//tradeTable_number	交易号	Nvarchar(20)	Not null	
		//tradeTable_merchantNumber	商户单号	Nvarchar(20)	Not null	
		//tradeTable_BillingClassification
		//	账单分类	Nvarchar(20)		
		//tradeTable__merchantName 	商户名称	Nvarchar(20)	Not null
		orderBaseServiceImpl.saveTradeTable(trade);
		System.out.println("trade========"+trade.toString());
		
		//生成订单
		OrderBase orderbase = new OrderBase();
		//设置当前时间，保存订单
		Date ordertime = null;
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			String formate = sdf.format(date);
			ordertime = sdf.parse(formate);
		} catch (ParseException e) {
			System.out.println("当前日期初始化 错误");
			e.printStackTrace();
		}
		//处理订单的未打折总价
				double subtotal =0;
				Iterator<Cart> cit = clist.iterator();
				while(cit.hasNext()){
					Cart cart = cit.next();
					subtotal= subtotal+cart.getCartTotalUndiscount();
				}
				
		//订单id
		orderbase.setOrderNumber(orderBaseServiceImpl.getRandom(11));//订单编号order_namae
		orderbase.setOrderTime(ordertime);//订单生成时间
		//order_payTime订单支付时间 
		//order_distributionTime订单配送时间
		//order_endTime	订单结束时间
		orderbase.setOrderState(0);//order_state 订单状态 设为待支付
		orderbase.setOrderTotalacount(subtotal);//order_totalAcount	支付金额(多种商品的总价)
		//order_freight	订单运费
		orderbase.setOrderReightrisk(order_reightRisk);//order_reightRisk	订单运费险
		orderbase.setUser(user);//user_id	用户Id
		orderbase.setAddress(address);//user_id	用户Id
		//invoice	是否开了开发票
		orderbase.setNote(note);//note	备注
		orderbase.setTrade(trade);//交易号
		orderBaseServiceImpl.saveOrderBase(orderbase);	
		System.out.println("orderbase======"+orderbase.toString());
		
		System.out.println("OrderNumber======"+orderbase.getOrderNumber());
		return orderbase.getOrderNumber();
	}
	
	
	
	/**
	 * 订单详情
	 * 
	 */
	@RequestMapping("showOrderBase")
	public @ResponseBody OrderBase showOrderBase(String orderNumber) {
		OrderBase orderlist = orderBaseServiceImpl.showOrderBase(orderNumber);
		
		//System.out.println(orderlist.toString());
		return orderlist;
	}
	
	
	//修改订单支付状态
	/**
	 * 0:待付款 1:已付款
	 * 2:取消订单3:退货
	 * 4:无效
	 * @param OrderState 订单支付状态
	 * @return
	 */
	@RequestMapping("/changeOrderState")
	@ResponseBody
	public void changeOrderState(Integer orderId,Integer orderState) {
		
		
		//最初订单支付状态都是0；
		
		//1:已付款
		orderBaseServiceImpl.changeOrderState(orderId,orderState);
		
		//2:取消订单
		
		//3:退货
		
		//4:无效
		
	}
	
	//支付密码验证
	@RequestMapping("/testpassword")
	@ResponseBody
	public boolean testpassword(Integer orderId,String password) {
		
		String regex = "[0-9] {6}";
		boolean flag = password.matches(regex);
		if(!flag)
			return false;
		orderBaseServiceImpl.changeOrderState(orderId,1);
		return true;
	}
	
	
	
}
