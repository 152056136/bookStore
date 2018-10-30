package com.nsc.backend.entity;

import java.util.Date;

//购物车实体类
public class Cart {
	private Integer cartId;
	private Date	cartJoinTime;
	private Double cartTotalUndiscount;
	private Double cartUnitPrice;
	private Integer cartCount;
	private boolean cartIsCheck;
	
	//订单关联的用户,每次加入购物车,只能加入一种商品,加入时先看数据库中是否有次商品，有数量加，没有则创建此商品
	private User user;
	private Book book;
	private Distributor distributor;
	private Store store;
	
	
	
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public boolean isCartIsCheck() {
		return cartIsCheck;
	}
	public void setCartIsCheck(boolean cartIsCheck) {
		this.cartIsCheck = cartIsCheck;
	}
	public Distributor getDistributor() {
		return distributor;
	}
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}
	public Double getCartUnitPrice() {
		return cartUnitPrice;
	}
	public void setCartUnitPrice(Double cartUnitPrice) {
		this.cartUnitPrice = cartUnitPrice;
	}
	public Integer getCartCount() {
		return cartCount;
	}
	public void setCartCount(Integer cartCount) {
		this.cartCount = cartCount;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Date getCartJoinTime() {
		return cartJoinTime;
	}
	public void setCartJoinTime(Date cartJoinTime) {
		this.cartJoinTime = cartJoinTime;
	}
	public Double getCartTotalUndiscount() {
		return cartTotalUndiscount;
	}
	public void setCartTotalUndiscount(Double cartTotalUndiscount) {
		this.cartTotalUndiscount = cartTotalUndiscount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartJoinTime=" + cartJoinTime + ", cartTotalUndiscount="
				+ cartTotalUndiscount + ", cartUnitPrice=" + cartUnitPrice + ", cartCount=" + cartCount
				+ ", cartIsCheck=" + cartIsCheck + ", user=" + user + ", book=" + book + ", distributor=" + distributor
				+ ", store=" + store + "]";
	}
			
}
