package com.nsc.backend.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.TradeTable;
import com.nsc.backend.mapper.OrderBaseMapper;
import com.nsc.backend.mapper.TradeTableMapper;
import com.nsc.backend.service.IOrderBaseService;


@Service
@Transactional
public class OrderBaseServiceImpl implements IOrderBaseService{

	@Autowired
	private OrderBaseMapper orderbaseMapper;
	
	@Autowired
	private TradeTableMapper tradeTableMapper;
	
	
	@Override
	public void saveOrderBase(OrderBase orderbase) {
		
		orderbaseMapper.insertSelective(orderbase);
	}

	//保存交易表
	@Override
	public void saveTradeTable(TradeTable tradetable) {
		
		tradeTableMapper.insertSelective(tradetable);
	}

	//更改支付状态
	@Override
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

	//生成11位数的随机数
	@Override

	public String getRandom(int length){		
		String val = "";
		Random random = new Random();
			for (int i = 0; i < length; i++) {
				val += String.valueOf(random.nextInt(10));
				}
			return val;
	}

	

}
