package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Complain;
import com.bs.tenement.dao.ComplainMapper;
import com.bs.tenement.service.ComplainService;

@Service
public class ComplainServiceImpl implements ComplainService{

	@Autowired
	private ComplainMapper comMapper;
	
	public int add(Complain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Complain t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Complain get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Complain> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
