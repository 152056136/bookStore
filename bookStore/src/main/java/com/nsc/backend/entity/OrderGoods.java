package com.nsc.backend.entity;

public class OrderGoods {
    private Integer ordergoodsId;
    private Integer ordergoodsCountordergoodsCount;
    private Byte ordergoodsIsreturngoods;
    private Byte ordergoodsIsgift;
    private Byte ordergoodsIsdiscounts;
    private Byte ordergoodsIsstorediscount;
    private Double ordergoodsDiscounamount;
    private Double ordergoodsTotalprice;
    private Byte ordergoodsDistributionstatus;
    private OrderBase orderbase;
    private Book book;
    
    
    
    
    public OrderBase getOrderbase() {
		return orderbase;
	}
	public void setOrderbase(OrderBase orderbase) {
		this.orderbase = orderbase;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getOrdergoodsId() {
        return ordergoodsId;
    }
    public void setOrdergoodsId(Integer ordergoodsId) {
        this.ordergoodsId = ordergoodsId;
    }
    public Integer getOrdergoodsCountordergoodsCount() {
        return ordergoodsCountordergoodsCount;
    }
    public void setOrdergoodsCountordergoodsCount(Integer ordergoodsCountordergoodsCount) {
        this.ordergoodsCountordergoodsCount = ordergoodsCountordergoodsCount;
    }
    public Byte getOrdergoodsIsreturngoods() {
        return ordergoodsIsreturngoods;
    }
    public void setOrdergoodsIsreturngoods(Byte ordergoodsIsreturngoods) {
        this.ordergoodsIsreturngoods = ordergoodsIsreturngoods;
    }

    public Byte getOrdergoodsIsgift() {
        return ordergoodsIsgift;
    }
    public void setOrdergoodsIsgift(Byte ordergoodsIsgift) {
        this.ordergoodsIsgift = ordergoodsIsgift;
    }
    public Byte getOrdergoodsIsdiscounts() {
        return ordergoodsIsdiscounts;
    }
    public void setOrdergoodsIsdiscounts(Byte ordergoodsIsdiscounts) {
        this.ordergoodsIsdiscounts = ordergoodsIsdiscounts;
    }
    public Byte getOrdergoodsIsstorediscount() {
        return ordergoodsIsstorediscount;
    }
    public void setOrdergoodsIsstorediscount(Byte ordergoodsIsstorediscount) {
        this.ordergoodsIsstorediscount = ordergoodsIsstorediscount;
    }
    public Double getOrdergoodsDiscounamount() {
        return ordergoodsDiscounamount;
    }
    public void setOrdergoodsDiscounamount(Double ordergoodsDiscounamount) {
        this.ordergoodsDiscounamount = ordergoodsDiscounamount;
    }
    public Double getOrdergoodsTotalprice() {
        return ordergoodsTotalprice;
    }
    public void setOrdergoodsTotalprice(Double ordergoodsTotalprice) {
        this.ordergoodsTotalprice = ordergoodsTotalprice;
    }
    public Byte getOrdergoodsDistributionstatus() {
        return ordergoodsDistributionstatus;
    }
    public void setOrdergoodsDistributionstatus(Byte ordergoodsDistributionstatus) {
        this.ordergoodsDistributionstatus = ordergoodsDistributionstatus;
    }
    
}