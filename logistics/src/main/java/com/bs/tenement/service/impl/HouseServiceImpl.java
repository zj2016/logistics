package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.House;
import com.bs.tenement.dao.HouseMapper;
import com.bs.tenement.service.HouseService;

@Service
public class HouseServiceImpl implements HouseService{

	@Autowired
	private HouseMapper houseMapper;
	
	public int add(House t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(House t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public House get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<House> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
