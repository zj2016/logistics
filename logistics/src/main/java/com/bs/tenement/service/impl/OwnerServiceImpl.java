package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Owner;
import com.bs.tenement.dao.OwnerMapper;
import com.bs.tenement.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Autowired
	private OwnerMapper ownMapper;
	
	public int add(Owner t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Owner t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Owner get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Owner> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
