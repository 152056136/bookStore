package com.nsc.web.util;

import java.util.Date;

import com.nsc.backend.entity.Address;
import com.nsc.backend.entity.Book;
import com.nsc.backend.entity.Store;

public class ROrderGoods {
	
	//子订单信息
    private Integer ordergoodsId;
    private String orderNumber;
    private String ordergoodsNumber;
    private Integer orderState;
    private Integer ordergoodsCount;
    private Integer Invoice;
    private Integer ordergoodsIsreturngoods;
    private Integer ordergoodsTotalprice;
    private Integer orderreturnStatus;
    private String orderreturnReason;
    //下单时间
    private Date orderTime;
    //交易号
    private String tradetableNumber;
    //交易时间
    private Date orderPaytime;
    //收货地址
    private Address address;
    private Book book;
    private Store store;
    
    
    
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Integer getOrdergoodsId() {
		return ordergoodsId;
	}
	public void setOrdergoodsId(Integer ordergoodsId) {
		this.ordergoodsId = ordergoodsId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrdergoodsNumber() {
		return ordergoodsNumber;
	}
	public void setOrdergoodsNumber(String ordergoodsNumber) {
		this.ordergoodsNumber = ordergoodsNumber;
	}
	public Integer getOrderState() {
		return orderState;
	}
	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}
	public Integer getOrdergoodsCount() {
		return ordergoodsCount;
	}
	public void setOrdergoodsCount(Integer ordergoodsCount) {
		this.ordergoodsCount = ordergoodsCount;
	}
	public Integer getInvoice() {
		return Invoice;
	}
	public void setInvoice(Integer invoice) {
		Invoice = invoice;
	}
	public Integer getOrdergoodsIsreturngoods() {
		return ordergoodsIsreturngoods;
	}
	public void setOrdergoodsIsreturngoods(Integer ordergoodsIsreturngoods) {
		this.ordergoodsIsreturngoods = ordergoodsIsreturngoods;
	}
	public Integer getOrdergoodsTotalprice() {
		return ordergoodsTotalprice;
	}
	public void setOrdergoodsTotalprice(Integer ordergoodsTotalprice) {
		this.ordergoodsTotalprice = ordergoodsTotalprice;
	}
	public Integer getOrderreturnStatus() {
		return orderreturnStatus;
	}
	public void setOrderreturnStatus(Integer orderreturnStatus) {
		this.orderreturnStatus = orderreturnStatus;
	}
	public String getOrderreturnReason() {
		return orderreturnReason;
	}
	public void setOrderreturnReason(String orderreturnReason) {
		this.orderreturnReason = orderreturnReason;
	}
	public String getTradetableNumber() {
		return tradetableNumber;
	}
	public void setTradetableNumber(String tradetableNumber) {
		this.tradetableNumber = tradetableNumber;
	}
	public Date getOrderPaytime() {
		return orderPaytime;
	}
	public void setOrderPaytime(Date orderPaytime) {
		this.orderPaytime = orderPaytime;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	@Override
	public String toString() {
		return "ROrderGoods [ordergoodsId=" + ordergoodsId + ", orderNumber=" + orderNumber + ", ordergoodsNumber="
				+ ordergoodsNumber + ", orderState=" + orderState + ", ordergoodsCount=" + ordergoodsCount
				+ ", Invoice=" + Invoice + ", ordergoodsIsreturngoods=" + ordergoodsIsreturngoods
				+ ", ordergoodsTotalprice=" + ordergoodsTotalprice + ", orderreturnStatus=" + orderreturnStatus
				+ ", orderreturnReason=" + orderreturnReason + ", tradetableNumber=" + tradetableNumber
				+ ", orderPaytime=" + orderPaytime + ", address=" + address + ", book=" + book + ", store=" + store
				+ "]";
	}
	

}
