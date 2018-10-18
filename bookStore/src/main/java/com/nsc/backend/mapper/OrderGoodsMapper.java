package com.nsc.backend.mapper;

import com.nsc.backend.entity.OrderGoods;

public interface OrderGoodsMapper {
    int deleteByPrimaryKey(Integer ordergoodsId);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    OrderGoods selectByPrimaryKey(Integer ordergoodsId);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);
}