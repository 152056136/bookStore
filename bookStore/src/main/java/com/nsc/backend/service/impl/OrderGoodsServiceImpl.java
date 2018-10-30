package com.nsc.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.Book;
import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.OrderGoods;
import com.nsc.backend.entity.Store;
import com.nsc.backend.mapper.OrderGoodsMapper;
import com.nsc.backend.mapper.StoreMapper;
import com.nsc.backend.service.IBookService;
import com.nsc.backend.service.IOrderGoodsService;
import com.nsc.web.util.OrderUtil;
import com.nsc.web.util.backstate.BackState;


@Service
@Transactional
public class OrderGoodsServiceImpl implements IOrderGoodsService{

	
	@Autowired
	IBookService bookServiceImpl;
	@Autowired
	StoreMapper storeMapper;
	@Autowired 
	OrderGoodsMapper ordergoodsMapper;
	/**
	 * 添加ordergoods信息
	 * @return 
	 */
	public int saveOrderGoods(OrderGoods ordergoods) {
		return  ordergoodsMapper.saveOrderGoods(ordergoods);
	}  
	//更改订单状态
    public void updateOrderState(String OrderNumber) {
    	ordergoodsMapper.updateOrderState(OrderNumber);
    }
    // 子订单对应新的主订单
    public void updateOrderNumberId(String goodsNumber,Integer orderId,String orderNumber) {
    	ordergoodsMapper.updateOrderNumberId(goodsNumber, orderId, orderNumber);
    }
    //查找用户的所有订单
    public List<OrderGoods> showOrderGoods(List<OrderBase> listb){
    	List<OrderGoods> list = ordergoodsMapper.showOrderGoods(listb);
    	return list;
    }
    //查找用户支付/未支付订单
   public List<OrderGoods> showOrderGoodsByIspay(List<OrderBase> listb,Integer state){
	   List<OrderGoods> list = ordergoodsMapper.showOrderGoods(listb);
   	return list;
   }
   //逻辑删除子订单
   public void updateOGoodsState(String ordergoodsnumber,Integer state) {
	   ordergoodsMapper.updateOGoodsState(ordergoodsnumber,state);
   }

}
