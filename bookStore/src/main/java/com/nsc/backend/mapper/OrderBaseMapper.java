package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.OrderBase;

public interface OrderBaseMapper {
    int deleteByPrimaryKey(Integer orderId);
    int insert(OrderBase record);
    OrderBase selectByPrimaryKey(Integer orderId);
    int updateByPrimaryKeySelective(OrderBase record);
    int updateByPrimaryKey(OrderBase record);
    
    int insertSelective(OrderBase record);
    //保存主订单
    int saveOrderBase(OrderBase record);
    //通过订单编号更新主订单信息
    void updateOrderBase(String orderNumber,String payTime,String tMerchantnumber);
    //通过主订单编号查找订单总金额和支付状态
    OrderBase findtotalAcount(String orderNumber);
    //设置order_isequal字段为1（相等）
    void setorderIsequal(String orderNumber);
    //获取主订单
    OrderBase getOrderBase(String baseNumber);
    //设置该订单为无效
    void setIsValid(String orderNumber);
    //通过openId查找所有主订单
    List<OrderBase> findOrderBaseByOpenId(Integer userId);
    //查找用户支付/未支付订单
    List<OrderBase> findOrderBaseByIspay(Integer userId,Integer state);
    
}