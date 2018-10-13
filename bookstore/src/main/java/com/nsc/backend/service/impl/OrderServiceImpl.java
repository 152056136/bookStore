package com.nsc.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.Cart;
import com.nsc.backend.entity.Order;
import com.nsc.backend.entity.OrderItem;
import com.nsc.backend.mapper.OrderMapper;
import com.nsc.backend.service.IOrderService;

/**
 * 操作订单类
 * @author Lenovo
 */
@Service
@Transactional
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	
	//将生成订单，保存
	public void saveOrder(Order order) {
		orderMapper.saveOrder(order);
	}
	//将单一购物项，关联订单保存到数据库
	public void saveOrderItem(OrderItem oit) {
		orderMapper.saveOrderItem(oit);
	}
	//根据openId和state查询用户的已支付订单和未支付订单等等 
	public List<Order> findOrders(Integer uid, Integer state) {
		 List<Order> olist = orderMapper.findOrders(uid,state);
		return olist;
	}
	//根据orderId，逻辑删除order
	public void deleteOrders(List<Integer> list) {
		orderMapper.deleteOrders(list);
	}
	
	
	
	
}
