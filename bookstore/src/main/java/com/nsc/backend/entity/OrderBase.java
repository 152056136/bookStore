package com.nsc.backend.entity;

import java.util.Date;

public class OrderBase {
    private Integer orderId;

    private String orderNumber;

    private Date orderTime;

    private Date orderPaytime;

    private Date orderDistributiontime;

    private Date orderEndtime;

    private Integer orderState;

    private Double orderTotalacount;

    private Double orderFreight;

    private Double orderReightrisk;

    private Byte invoice;

    private String note;

    private User user;
    
    private Address address;
    
    //交易表
    private TradeTable trade;
    
    
    
    
    public TradeTable getTrade() {
		return trade;
	}

	public void setTrade(TradeTable trade) {
		this.trade = trade;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
        this.orderNumber = orderNumber;
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

    public Date getOrderDistributiontime() {
        return orderDistributiontime;
    }

    public void setOrderDistributiontime(Date orderDistributiontime) {
        this.orderDistributiontime = orderDistributiontime;
    }

    public Date getOrderEndtime() {
        return orderEndtime;
    }

    public void setOrderEndtime(Date orderEndtime) {
        this.orderEndtime = orderEndtime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Double getOrderTotalacount() {
        return orderTotalacount;
    }

    public void setOrderTotalacount(Double orderTotalacount) {
        this.orderTotalacount = orderTotalacount;
    }

    public Double getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(Double orderFreight) {
        this.orderFreight = orderFreight;
    }

    public Double getOrderReightrisk() {
        return orderReightrisk;
    }

    public void setOrderReightrisk(Double orderReightrisk) {
        this.orderReightrisk = orderReightrisk;
    }

    public Byte getInvoice() {
        return invoice;
    }

    public void setInvoice(Byte invoice) {
        this.invoice = invoice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

	@Override
	public String toString() {
		return "OrderBase [orderId=" + orderId + ", orderNumber=" + orderNumber + ", orderTime=" + orderTime
				+ ", orderPaytime=" + orderPaytime + ", orderDistributiontime=" + orderDistributiontime
				+ ", orderEndtime=" + orderEndtime + ", orderState=" + orderState + ", orderTotalacount="
				+ orderTotalacount + ", orderFreight=" + orderFreight + ", orderReightrisk=" + orderReightrisk
				+ ", invoice=" + invoice + ", note=" + note + ",\n user=" + user + ",\n address=" + address + ",\n trade="
				+ trade + "]";
	}

	

	
    
    
}