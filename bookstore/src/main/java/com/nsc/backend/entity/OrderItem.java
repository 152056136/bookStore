package com.nsc.backend.entity;
/**
 * 订单项实体类
 * @author Lenovo
 *
 */
public class OrderItem {
	private Integer oitemId;
	private Double oitemUnitPrice;
	private Double oitemDiscounted;
	private Integer oitemCount;
	private Double oitemSubtotal;
	//关联的书籍
	private Book book;
	//关联的订单
	private Order order;
	//关联的提供商
	private Distributor distributor;
	
	
	public Distributor getDistributor() {
		return distributor;
	}
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}
	public Integer getOitemId() {
		return oitemId;
	}
	public void setOitemId(Integer oitemId) {
		this.oitemId = oitemId;
	}
	public Double getOitemUnitPrice() {
		return oitemUnitPrice;
	}
	public void setOitemUnitPrice(Double oitemUnitPrice) {
		this.oitemUnitPrice = oitemUnitPrice;
	}
	public Double getOitemDiscounted() {
		return oitemDiscounted;
	}
	public void setOitemDiscounted(Double oitemDiscounted) {
		this.oitemDiscounted = oitemDiscounted;
	}
	public Integer getOitemCount() {
		return oitemCount;
	}
	public void setOitemCount(Integer oitemCount) {
		this.oitemCount = oitemCount;
	}
	public Double getOitemSubtotal() {
		return oitemSubtotal;
	}
	public void setOitemSubtotal(Double oitemSubtotal) {
		this.oitemSubtotal = oitemSubtotal;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	
}
