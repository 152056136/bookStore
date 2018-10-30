package com.nsc.backend.entity;

public class OrderGoods {
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
    private OrderBase orderBase;
    private Book book;
    private Store store;

    
    public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getInvoice() {
		return Invoice;
	}

	public void setInvoice(Integer invoice) {
		Invoice = invoice;
	}

	public Integer getOrdergoodsId() {
        return ordergoodsId;
    }

    public void setOrdergoodsId(Integer ordergoodsId) {
        this.ordergoodsId = ordergoodsId;
    }


    public OrderBase getOrderBase() {
		return orderBase;
	}

	public void setOrderBase(OrderBase orderBase) {
		this.orderBase = orderBase;
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
        this.orderreturnReason = orderreturnReason == null ? null : orderreturnReason.trim();
    }

	@Override
	public String toString() {
		return "OrderGoods [ordergoodsId=" + ordergoodsId + ", orderBase=" + orderBase + ", orderNumber=" + orderNumber
				+ ", ordergoodsNumber=" + ordergoodsNumber + ", orderState=" + orderState + ", ordergoodsCount="
				+ ordergoodsCount + ", Invoice=" + Invoice + ", ordergoodsIsreturngoods=" + ordergoodsIsreturngoods
				+ ", ordergoodsTotalprice=" + ordergoodsTotalprice + ", orderreturnStatus=" + orderreturnStatus
				+ ", orderreturnReason=" + orderreturnReason + ", book=" + book + ", store=" + store + "]";
	}

	
    
	
    
}