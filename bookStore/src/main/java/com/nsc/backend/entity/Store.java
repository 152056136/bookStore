package com.nsc.backend.entity;

public class Store {
    private Integer storeId;
    private String storeSn;
    private Integer storeAreald1;
    private Integer storeAreaid2;
    private Integer storeAreadid3;
    private Integer storeGoodscatid1;
    private Integer storeGoodscatid2;
    private Integer storeGoodscatid3;
    private Byte storeIsself;
    private String storeName;
    private String storeCompany;
    private String storeTel;
    private String storeAddress;
    private Byte storeIsinvoice;
    private Float storeServicestarttime;
    private Float storeServiceendtime;
    private Byte storeStatus;
    private Byte storeActive;
    private Integer storeScore;
    private String orderReightRisk;
    
    
    
    public String getOrderReightRisk() {
		return orderReightRisk;
	}

	public void setOrderReightRisk(String orderReightRisk) {
		this.orderReightRisk = orderReightRisk;
	}

	public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreSn() {
        return storeSn;
    }

    public void setStoreSn(String storeSn) {
        this.storeSn = storeSn == null ? null : storeSn.trim();
    }

    public Integer getStoreAreald1() {
        return storeAreald1;
    }

    public void setStoreAreald1(Integer storeAreald1) {
        this.storeAreald1 = storeAreald1;
    }

    public Integer getStoreAreaid2() {
        return storeAreaid2;
    }

    public void setStoreAreaid2(Integer storeAreaid2) {
        this.storeAreaid2 = storeAreaid2;
    }

    public Integer getStoreAreadid3() {
        return storeAreadid3;
    }

    public void setStoreAreadid3(Integer storeAreadid3) {
        this.storeAreadid3 = storeAreadid3;
    }

    public Integer getStoreGoodscatid1() {
        return storeGoodscatid1;
    }

    public void setStoreGoodscatid1(Integer storeGoodscatid1) {
        this.storeGoodscatid1 = storeGoodscatid1;
    }

    public Integer getStoreGoodscatid2() {
        return storeGoodscatid2;
    }

    public void setStoreGoodscatid2(Integer storeGoodscatid2) {
        this.storeGoodscatid2 = storeGoodscatid2;
    }

    public Integer getStoreGoodscatid3() {
        return storeGoodscatid3;
    }

    public void setStoreGoodscatid3(Integer storeGoodscatid3) {
        this.storeGoodscatid3 = storeGoodscatid3;
    }

    public Byte getStoreIsself() {
        return storeIsself;
    }

    public void setStoreIsself(Byte storeIsself) {
        this.storeIsself = storeIsself;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreCompany() {
        return storeCompany;
    }

    public void setStoreCompany(String storeCompany) {
        this.storeCompany = storeCompany == null ? null : storeCompany.trim();
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel == null ? null : storeTel.trim();
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public Byte getStoreIsinvoice() {
        return storeIsinvoice;
    }

    public void setStoreIsinvoice(Byte storeIsinvoice) {
        this.storeIsinvoice = storeIsinvoice;
    }

    public Float getStoreServicestarttime() {
        return storeServicestarttime;
    }

    public void setStoreServicestarttime(Float storeServicestarttime) {
        this.storeServicestarttime = storeServicestarttime;
    }

    public Float getStoreServiceendtime() {
        return storeServiceendtime;
    }

    public void setStoreServiceendtime(Float storeServiceendtime) {
        this.storeServiceendtime = storeServiceendtime;
    }

    public Byte getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Byte storeStatus) {
        this.storeStatus = storeStatus;
    }

    public Byte getStoreActive() {
        return storeActive;
    }

    public void setStoreActive(Byte storeActive) {
        this.storeActive = storeActive;
    }


    public Integer getStoreScore() {
        return storeScore;
    }

    public void setStoreScore(Integer storeScore) {
        this.storeScore = storeScore;
    }
}