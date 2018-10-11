package com.nsc.backend.service;

import java.util.List;

import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.TradeTable;

public interface IOrderBaseService {
	
	//加入订单，器订单初始状态为order_state=0:待付款
	//0:待付款 1:已付款
	//2:取消订单3:退货
	//4:无效
	void saveOrderBase(OrderBase orderbase);
	
	//保存交易表
	void saveTradeTable(TradeTable tradetable);
	
	//修改订单支付状态
	void changeOrderState(Integer orderId,Integer orderState);
	
	//订单详情
	OrderBase showOrderBase(String orderNumber);
	
	//生成11位数的随机数
	String getRandom(int length);
	
}
