package com.nsc.backend.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单实体类
 * @author Lenovo
 *
 */
public class Order {
		//普通属性
		private Integer orderId;
		private Date orderTime;
		private Date orderPayTime;
		private Double orderTotalDiscount;
		private Double orderTotalUndiscount;
		private Integer orderState;
		private String orderNote;
		//关联外键,一个用户可以有多个订单
		private User user;
		//多订单可以对应一个收货地址
		private Address address;
		//一个订单可以划分为若干个订单项
		private List<OrderItem> olist =new ArrayList<OrderItem>();
		
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public List<OrderItem> getOlist() {
			return olist;
		}
		public void setOlist(List<OrderItem> olist) {
			this.olist = olist;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getOrderNote() {
			return orderNote;
		}
		public void setOrderNote(String orderNote) {
			this.orderNote = orderNote;
		}
		public Integer getOrderId() {
			return orderId;
		}
		public void setOrderId(Integer orderId) {
			this.orderId = orderId;
		}
		public Date getOrderTime() {
			return orderTime;
		}
		public void setOrderTime(Date orderTime) {
			this.orderTime = orderTime;
		}
		public Date getOrderPayTime() {
			return orderPayTime;
		}
		public void setOrderPayTime(Date orderPayTime) {
			this.orderPayTime = orderPayTime;
		}
		public Double getOrderTotalDiscount() {
			return orderTotalDiscount;
		}
		public void setOrderTotalDiscount(Double orderTotalDiscount) {
			this.orderTotalDiscount = orderTotalDiscount;
		}
		public Double getOrderTotalUndiscount() {
			return orderTotalUndiscount;
		}
		public void setOrderTotalUndiscount(Double orderTotalUndiscount) {
			this.orderTotalUndiscount = orderTotalUndiscount;
		}
		public Integer getOrderState() {
			return orderState;
		}
		public void setOrderState(Integer orderState) {
			this.orderState = orderState;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", orderTime=" + orderTime + ", orderPayTime=" + orderPayTime
					+ ", orderTotalDiscount=" + orderTotalDiscount + ", orderTotalUndiscount=" + orderTotalUndiscount
					+ ", orderState=" + orderState + ", orderNote=" + orderNote + ", user=" + user + ", address="
					+ address + ", olist=" + olist + "]";
		}
		
		
}
