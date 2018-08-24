package com.nsc.backend.entity;
//购物项实体类
public class CartItem {
	private Integer citemId;
	private Double 	citemUnitPrice;
	private Integer citemCount;
	private Double 	citemSubtotal;
	//和具体的书籍关联
	private Book book;
	//和不同时间提交的购物单关联
	private Cart cart;
	public Integer getCitemId() {
		return citemId;
	}
	public void setCitemId(Integer citemId) {
		this.citemId = citemId;
	}
	public Double getCitemUnitPrice() {
		return citemUnitPrice;
	}
	public void setCitemUnitPrice(Double citemUnitPrice) {
		this.citemUnitPrice = citemUnitPrice;
	}
	public Integer getCitemCount() {
		return citemCount;
	}
	public void setCitemCount(Integer citemCount) {
		this.citemCount = citemCount;
	}
	public Double getCitemSubtotal() {
		return citemSubtotal;
	}
	public void setCitemSubtotal(Double citemSubtotal) {
		this.citemSubtotal = citemSubtotal;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
	
	
}
