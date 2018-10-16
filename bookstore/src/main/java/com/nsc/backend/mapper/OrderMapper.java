package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.Cart;
import com.nsc.backend.entity.Order;
import com.nsc.backend.entity.OrderItem;

//订单接口
public interface OrderMapper {
	
	//保存订单到数据库
	void saveOrder (Order order);	
	void saveOrder1 (Order order);
	//将单一购物项，关联订单保存到数据库
	void saveOrderItem(OrderItem oit);
	//根据openId和state查询用户的已支付订单和未支付订单等等 
	List<Order> findOrders(Integer uid, Integer state);
	//根据orderId，逻辑删除order
	void deleteOrders(List<Integer> list);
	
}
