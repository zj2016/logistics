package com.bs.tenement.rest;

import java.util.List;

public class RestResultList<T> {

	public static final Integer SUCCESS = 10000;
	
	public static final Integer FAIL = 10500;
	
	private Integer code;
	
	private String info;
	
	private List<T> response;

	public Integer getCode() {
		return code;
	}

	public RestResultList<T> setCode(Integer code) {
		this.code = code;
		return this;
	}

	public String getInfo() {
		return info;
	}

	public RestResultList<T> setInfo(String info) {
		this.info = info;
		return this;
	}

	public List<T> getResponse() {
		return response;
	}

	public RestResultList<T> setResponse(List<T> response) {
		this.response = response;
		return this;
	}
	
	public RestResultList(Integer code, String info) {
		super();
		this.code = code;
		this.info = info;
	}

	public static RestResultList error(Integer code, String info){
		return new RestResultList(code, info);
	}
	
	public static RestResultList error(String info){
		return error(FAIL,info);
	}
	
	public static RestResultList success(){
		return new RestResultList(SUCCESS, "success");
	}
	
}
