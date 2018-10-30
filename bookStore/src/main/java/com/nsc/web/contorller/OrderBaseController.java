package com.nsc.web.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.User;
import com.nsc.backend.service.IOrderBaseService;
import com.nsc.backend.service.IUserService;
import com.nsc.web.util.OrderUtil;
import com.nsc.web.util.backstate.BackState;

@RequestMapping("OrderBase")
@Controller
public class OrderBaseController {
	
	@Autowired
	private IOrderBaseService orderBaseServiceImpl;
	@Autowired
	private IUserService 	userServiceImpl;
	
	
	/** 保存主订单 测
	 *  @param order_totalAcount 支付总金额
	 *  @param tradeTable_method 支付方式
	 *  @param openId  
	 */
	@RequestMapping("/addToOrderBase")
	@ResponseBody
	public BackState addToOrderBase(@RequestBody String orderparam) {
		/*String param_1 ="{\"openId\":\"o_1QS0TEoGebWrlHCxz-bzokvyj0\","
				+"\"order_totalAcount\":\"600\","
				+"\"tradeTable_method\":\"1\"}";
		JSONObject json = JSONObject.parseObject(orderparam);
		
		String openId = json.getString("openId");
		Double order_totalAcount = json.getDouble("order_totalAcount");
		Integer tradeTable_method = json.getInteger("tradeTable_method");*/
		
		BackState state = new BackState();
		OrderBase orderbase= new OrderBase();
		//主订单Id  ——自动增长
		//订单编号
		String order_number = OrderUtil.getRandom(0);
		//订单生成时间
		Date order_time = null;
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			String formate = sdf.format(date);
			order_time = sdf.parse(formate);
		} catch (ParseException e) {
			System.out.println("当前日期初始化 错误");
			e.printStackTrace();
		}
		//用户 (买家) Id
		User user = userServiceImpl.findUserByopenId("o_1QS0TEoGebWrlHCxz-bzokvyj0");
		try {
			orderbase.setOrderNumber(order_number);
			orderbase.setOrderTime(order_time);
			orderbase.setOrderTotalacount(10);
			orderbase.setUserId(user);
			orderbase.setTradetableMethod(1);
			System.out.println(orderbase.toString());
			
			orderBaseServiceImpl.saveOrderbase(orderbase);
			state.setStateName("HTTP Status 200");
			return  state;
		}catch (Exception e) {
			state.setStateName("主订单异常，请重新下单！");
			return state;
		
		}
	}
	
	//更新订单信息 测
	@RequestMapping("/upDate")
	@ResponseBody
	public void upDate() {
		
		String orderNumber="154042657201330972";
		String tMerchantnumber="1*********8";
		
		/*Date order_payTime = null;
		try {
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
			String formate = sdf.format(date);
			order_payTime = sdf.parse(formate);
			System.out.println(order_payTime);
			
		} catch (ParseException e) {
			System.out.println("当前日期初始化 错误");
			e.printStackTrace();
		}*/
		String date = "20151101095440";

		String reg = "(\\d{4})(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})";
		date = date.replaceAll(reg, "$1-$2-$3 $4:$5:$6");
		System.out.println(date);
		
		System.out.println("orderBaseServiceImpl====="+orderBaseServiceImpl);
		orderBaseServiceImpl.updateOrderBase(orderNumber, date, tMerchantnumber);
		
		
	}
	
	
	//测试
	@RequestMapping("/findtotalAcount")
	@ResponseBody
	public OrderBase findtotalAcount() {
		
		/*Date order_time = null;
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			String formate = sdf.format(date);
			order_time = sdf.parse(formate);
			System.out.println(order_time);
		} catch (ParseException e) {
			System.out.println("当前日期初始化 错误");
			e.printStackTrace();
		}
		
		String datetime =  "20140212111012";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime ldt = LocalDateTime.parse(datetime,dtf);
        System.out.println(ldt);*/

		
		String orderNumber="154042657201330972";
		System.out.println(orderBaseServiceImpl);
		OrderBase o = orderBaseServiceImpl.findtotalAcount(orderNumber);
		orderBaseServiceImpl.setorderIsequal(orderNumber);
		System.out.println(o);
		return o;
		
	}
	
}
