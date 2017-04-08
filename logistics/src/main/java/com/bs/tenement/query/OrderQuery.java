package com.bs.tenement.query;

public class OrderQuery extends Query{

	private String yType;
	
	private Integer status;

	public String getyType() {
		return yType;
	}

	public void setyType(String yType) {
		this.yType = yType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
