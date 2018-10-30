package com.nsc.backend.entity;

import java.util.Date;

public class OrderBase {
    private Integer orderId;
    private String orderNumber;
    private Date orderTime;
    private Date orderPaytime;
    private Date orderEndtime;
    private Integer orderTotalacount;
    private User user;
    private Integer tradetableMethod;
    private String tradetableNumber;
    private Address address;
    private Integer orderIspay;
    private Integer orderIsequal;


    
    public Integer getOrderIspay() {
		return orderIspay;
	}

	public void setOrderIspay(Integer orderIspay) {
		this.orderIspay = orderIspay;
	}

	public Integer getOrderIsequal() {
		return orderIsequal;
	}

	public void setOrderIsequal(Integer orderIsequal) {
		this.orderIsequal = orderIsequal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderPaytime() {
        return orderPaytime;
    }

    public void setOrderPaytime(Date orderPaytime) {
        this.orderPaytime = orderPaytime;
    }

    public Date getOrderEndtime() {
        return orderEndtime;
    }

    public void setOrderEndtime(Date orderEndtime) {
        this.orderEndtime = orderEndtime;
    }

    public Integer getOrderTotalacount() {
        return orderTotalacount;
    }

    public void setOrderTotalacount(Integer orderTotalacount) {
        this.orderTotalacount = orderTotalacount;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public Integer getTradetableMethod() {
		return tradetableMethod;
	}

	public void setTradetableMethod(Integer tradetableMethod) {
		this.tradetableMethod = tradetableMethod;
	}

	public String getTradetableNumber() {
        return tradetableNumber;
    }

    public void setTradetableNumber(String tradetableNumber) {
        this.tradetableNumber = tradetableNumber == null ? null : tradetableNumber.trim();
    }

	@Override
	public String toString() {
		return "OrderBase [orderId=" + orderId + ", orderNumber=" + orderNumber + ", orderTime=" + orderTime
				+ ", orderPaytime=" + orderPaytime + ", orderEndtime=" + orderEndtime + ", orderTotalacount="
				+ orderTotalacount + ", user=" + user + ", tradetableMethod=" + tradetableMethod + ", tradetableNumber="
				+ tradetableNumber + ", address=" + address + "]";
	}
    
    
}