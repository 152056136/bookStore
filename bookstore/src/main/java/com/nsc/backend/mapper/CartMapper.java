package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.Cart;

//购物车接口
public interface CartMapper {
	
	//判断购物车是否有此商品
	Cart getCartByBookId(Integer bookId ,String openId);
	//将更新的购物车信息，在数据库进行更新
	void updateCart(Cart cart);
	//保存订单信息到数据库
	void saveCart(Cart cart);
	//根据用户id将此用户的购物信息，查找出来
	List<Cart> showCart(String openId);
	//将list传向持久层，删除购物车信息
	void deleteCart(List<Integer> list);
	//根据cartId的list集合，将List<Cart>查询出来 
	List<Cart> findCartByList(List<Integer> list);
	//修改数据中cart的count
	void updateBookCount(Cart cart);
	//根据cartid查找cart
	Cart findCartByCartId(Integer cartId);
	
	
	
}
