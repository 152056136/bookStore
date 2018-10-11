package com.nsc.backend.entity;

public class TradeTable {
    private Integer tradetableId;

    private Integer tradetableMethod;

    private String tradetableNumber;

    private String tradetableMerchantnumber;

    private String tradetableBillingclassification;

    private String tradetableMerchantname;


	public Integer getTradetableId() {
        return tradetableId;
    }

    public void setTradetableId(Integer tradetableId) {
        this.tradetableId = tradetableId;
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

    public String getTradetableMerchantnumber() {
        return tradetableMerchantnumber;
    }

    public void setTradetableMerchantnumber(String tradetableMerchantnumber) {
        this.tradetableMerchantnumber = tradetableMerchantnumber == null ? null : tradetableMerchantnumber.trim();
    }

    public String getTradetableBillingclassification() {
        return tradetableBillingclassification;
    }

    public void setTradetableBillingclassification(String tradetableBillingclassification) {
        this.tradetableBillingclassification = tradetableBillingclassification == null ? null : tradetableBillingclassification.trim();
    }

    public String getTradetableMerchantname() {
        return tradetableMerchantname;
    }

    public void setTradetableMerchantname(String tradetableMerchantname) {
        this.tradetableMerchantname = tradetableMerchantname == null ? null : tradetableMerchantname.trim();
    }

	@Override
	public String toString() {
		return "TradeTable [tradetableId=" + tradetableId + ", tradetableMethod=" + tradetableMethod
				+ ", tradetableNumber=" + tradetableNumber + ", tradetableMerchantnumber=" + tradetableMerchantnumber
				+ ", tradetableBillingclassification=" + tradetableBillingclassification + ", tradetableMerchantname="
				+ tradetableMerchantname + "]";
	}

	


}