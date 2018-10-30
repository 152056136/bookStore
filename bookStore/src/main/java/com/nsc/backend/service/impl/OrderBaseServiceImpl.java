package com.nsc.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.mapper.OrderBaseMapper;
import com.nsc.backend.service.IOrderBaseService;

@Transactional
@Service
public class OrderBaseServiceImpl implements IOrderBaseService{

	@Autowired
	private OrderBaseMapper orderbaseMapper;
	
	
	//保存主订单
	public int saveOrderbase(OrderBase orderbase) {
		
		return orderbaseMapper.saveOrderBase(orderbase);
		
	}
	//通过订单编号更新主订单
	public void updateOrderBase(String orderNumber,String payTime,String tMerchantnumber) {
		System.out.println("updateOrderBase————————start");
		System.out.println(orderbaseMapper+"==============================");
		orderbaseMapper.updateOrderBase(orderNumber, payTime, tMerchantnumber);
		System.out.println("updateOrderBase————————end");
	}
	//通过主订单编号查找订单总金额 
    public OrderBase findtotalAcount(String orderNumber) {
    	System.out.println("1111111111");
    	OrderBase i = orderbaseMapper.findtotalAcount(orderNumber);
    	System.out.println("2222222222");
    	return i;
    }
    //设置order_isequal字段为1（相等）
    public void setorderIsequal(String orderNumber) {
    	orderbaseMapper.setorderIsequal(orderNumber);
    }
    
    //获取主订单
    public OrderBase getOrderBase(String baseNumber) {
    	
    	OrderBase orderbase;
    	orderbase = orderbaseMapper.getOrderBase(baseNumber);
    	return orderbase;
    }
    //设置该订单为无效
    public void setIsValid(String orderNumber) {
    	orderbaseMapper.setIsValid(orderNumber);
    	
    }
    //通过openId查找所有主订单
    public List<OrderBase> findOrderBaseByOpenId(Integer userId) {
    	List<OrderBase> list = orderbaseMapper.findOrderBaseByOpenId(userId);
    	return list;
    }
    //查找用户支付/未支付订单
    public List<OrderBase> findOrderBaseByIspay(Integer userId,Integer state){
    	List<OrderBase> list = orderbaseMapper.findOrderBaseByIspay(userId,state);
    	return list;
    }
}
