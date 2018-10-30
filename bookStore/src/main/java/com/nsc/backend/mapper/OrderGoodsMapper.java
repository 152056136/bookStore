package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.OrderGoods;

public interface OrderGoodsMapper {
    int deleteByPrimaryKey(Integer ordergoodsId);
    int insert(OrderGoods record);
    int insertSelective(OrderGoods record);
    OrderGoods selectByPrimaryKey(Integer ordergoodsId);
    int updateByPrimaryKeySelective(OrderGoods record);
    int updateByPrimaryKey(OrderGoods record);
    
    //保存子订单
    int saveOrderGoods(OrderGoods ordergoods);
    //更改订单状态
    void updateOrderState(String OrderNumber);
    // 子订单对应新的主订单
    void updateOrderNumberId(String goodsNumber,Integer orderId,String orderNumber);
    //查找用户的所有订单
    List<OrderGoods> showOrderGoods(List<OrderBase> listb);
   //查找用户支付/未支付订单
    List<OrderGoods> showOrderGoodsByIspay(List<OrderBase> listb,Integer state);
    //逻辑删除子订单
    void updateOGoodsState(String ordergoodsnumber,Integer state);
    
    
}