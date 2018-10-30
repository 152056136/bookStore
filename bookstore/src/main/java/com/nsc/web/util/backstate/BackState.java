package com.nsc.web.util.backstate;

import com.nsc.web.vo.Json;

/**
 * 为小程序前台显示后台更新的信息
 * @author Lenovo
 */
public class BackState {
	private Double stateId;
	private String  stateName;
	private String orderNumber;
	
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Double getStateId() {
		return stateId;
	}
	public void setStateId(Double stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "BackState [stateId=" + stateId + ", stateName=" + stateName + ", orderNumber=" + orderNumber + "]";
	}
	
	
	
}
