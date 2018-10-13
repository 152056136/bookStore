package com.nsc.backend.mapper;

import com.nsc.backend.entity.TradeTable;

public interface TradeTableMapper {
    int deleteByPrimaryKey(Integer tradetableId);

    int insert(TradeTable record);

    int insertSelective(TradeTable record);

    TradeTable selectByPrimaryKey(Integer tradetableId);

    int updateByPrimaryKeySelective(TradeTable record);

    int updateByPrimaryKey(TradeTable record);
}