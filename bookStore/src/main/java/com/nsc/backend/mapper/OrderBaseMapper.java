package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.OrderBase;

public interface OrderBaseMapper {
	//根据主键删除
    int deleteByPrimaryKey(Integer orderId);
    //插入
    int insert(OrderBase record);
    //选择某个信息插入
    int insertSelective(OrderBase record);
    //根据订单编号查找订单信息
    OrderBase selectByOrderNumber(String orderNumber);
    OrderBase selectByPrimaryKey(Integer orderId);
    //更新某个信息
    int updateByPrimaryKeySelective(OrderBase record);
    //更改支付状态
    int updateorderStateByPrimaryKey(Integer orderId,Integer orderState);
    //通过userId找出所有订单
    List<OrderBase> findOrderBaseByUserId(Integer userId);
    
}