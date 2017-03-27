package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Way;
import com.bs.tenement.dao.WayMapper;
import com.bs.tenement.service.WayService;

@Service
public class WayServiceImpl implements WayService{

	@Autowired
	private WayMapper wayMapper;
	
	@Override
	public int add(Way t) {
		return wayMapper.insert(t);
	}

	@Override
	public int update(Way t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Way get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Way> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
