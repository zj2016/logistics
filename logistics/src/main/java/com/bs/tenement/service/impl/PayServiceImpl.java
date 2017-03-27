package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Pay;
import com.bs.tenement.dao.PayMapper;
import com.bs.tenement.service.PayService;

@Service
public class PayServiceImpl implements PayService{

	@Autowired
	private PayMapper payMapper;
	
	public int add(Pay t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Pay t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Pay get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pay> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
