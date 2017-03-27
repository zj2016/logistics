package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.dao.ServiceMapper;
import com.bs.tenement.service.ServiceService;

@Service
public class ServiceSImpl implements ServiceService{

	@Autowired
	private ServiceMapper serMapper;

	public int add(com.bs.tenement.bean.Service t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(com.bs.tenement.bean.Service t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public com.bs.tenement.bean.Service get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<com.bs.tenement.bean.Service> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
