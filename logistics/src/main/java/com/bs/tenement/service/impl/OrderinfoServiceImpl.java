package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Orderinfo;
import com.bs.tenement.dao.OrderinfoMapper;
import com.bs.tenement.service.OrderinfoService;

@Service
public class OrderinfoServiceImpl implements OrderinfoService{

	@Autowired
	private OrderinfoMapper orderMapper;
	
	@Override
	public int add(Orderinfo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Orderinfo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orderinfo get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orderinfo> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
