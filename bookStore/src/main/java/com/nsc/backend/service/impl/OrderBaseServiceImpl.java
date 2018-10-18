package com.nsc.backend.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.Address;
import com.nsc.backend.entity.Cart;
import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.TradeTable;
import com.nsc.backend.entity.User;
import com.nsc.backend.mapper.OrderBaseMapper;
import com.nsc.backend.mapper.TradeTableMapper;
import com.nsc.backend.service.ICartService;
import com.nsc.backend.service.IOrderBaseService;
import com.nsc.web.util.OrderUtil;
import com.nsc.web.util.backstate.BackState;


@Service
@Transactional
public class OrderBaseServiceImpl implements IOrderBaseService{

	@Autowired
	private OrderBaseMapper orderbaseMapper;
	@Autowired
	private TradeTableMapper tradeTableMapper;
	@Autowired
	private ICartService cartserviceimpl;
	
	//保存订单
	@Override
	public BackState saveOrderBase(Integer storeId ,Double orderFreight ,
			Double orderReightRisk,User user,Address address,String note) {
		
		//自增   order_id	Id
		//order_number	订单编号
		String orderNumber = OrderUtil.getRandom(storeId);
		//order_time	订单生成时间
		Date orderTime = null;
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			String formate = sdf.format(date);
			orderTime = sdf.parse(formate);
		} catch (ParseException e) {
			System.out.println("当前日期初始化 错误");
			e.printStackTrace();
		}
		//order_payTime	订单支付时间
		
		//order_distributionTime	订单配送时间
		
		//order_endTime	订单结束时间
		
		//order_state	订单状态(状态都为待付款0)
		
		//order_totalAcount	支付金额(多种商品的总价)
		//查出需要付款的cartId
		List<Cart> clist =cartserviceimpl.findPayCartByStoreId(storeId);
		double subtotal =0;//订单总价
		Iterator<Cart> cit = clist.iterator();
		while(cit.hasNext()){
			Cart cart = cit.next();
			subtotal= subtotal+cart.getCartTotalUndiscount();
		}
		
		//order_freight	订单运费(参数)
		//order_reightRisk	订单运费险(参数)
		//user_id	用户Id
		//invoice	是否开了开发票
		//note	备注(参数)
		
		BackState state = new BackState();
		try {
		OrderBase orderbase = new OrderBase();
		orderbase.setOrderNumber(orderNumber);
		orderbase.setOrderTime(orderTime);
		orderbase.setOrderState(0);
		orderbase.setOrderTotalacount(subtotal);
		orderbase.setOrderFreight(orderFreight);
		orderbase.setOrderReightrisk(orderReightRisk);
		orderbase.setUser(user);
		orderbase.setAddress(address);
		orderbase.setNote(note);
		orderbaseMapper.insertSelective(orderbase);
		
		/**
		 * 一旦订单生成应该再次生成对应的 订单明细（表名：order_goods）
		 * 
		 * 并且应该把购物车中对应的cart信息删掉(若不删除，则对应的showcart应该改为 选择字段cart_isCheck=0的cart信息)
		 */
		
		
		
		
		
		state.setStateName("HTTP Status 200");
		return  state;
		}catch (Exception e) {
			state.setStateName("订单异常，请重新下单！");
			/**
			 * 若是订单异常，应该把购物车里对应cart 信息中cart_isCheck字段从1改为0或null
			 */
			
			return state;
		}
		
		
	}

	//保存交易表
	public void saveTradeTable(TradeTable tradetable) {
		
		tradeTableMapper.insertSelective(tradetable);
	}

	//更改支付状态
	public void changeOrderState(Integer orderId,Integer orderState) {
		orderbaseMapper.updateorderStateByPrimaryKey(orderId,orderState);
		
		
	}

	//订单详情
	public OrderBase showOrderBase(String orderNumber) {
		System.out.println(orderNumber);
		OrderBase orderbase = orderbaseMapper.selectByOrderNumber(orderNumber);
		System.out.println(orderbase);
		return orderbase;
	}


	//通过userId找出所有订单
	@Override
	public List<OrderBase> findOrderBaseByUserId(Integer userId) {
		List<OrderBase> orderlist;
		orderlist = orderbaseMapper.findOrderBaseByUserId(userId);
		return orderlist;
	}
	
	

}
