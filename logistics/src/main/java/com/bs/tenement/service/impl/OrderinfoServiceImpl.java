package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Orderinfo;
import com.bs.tenement.dao.OrderinfoMapper;
import com.bs.tenement.service.OrderinfoService;
import com.bs.tenement.utils.DateUtils;
import com.bs.tenement.utils.IdUtils;

@Service
public class OrderinfoServiceImpl implements OrderinfoService{

	@Autowired
	private OrderinfoMapper orderMapper;
	
	@Override
	public int add(Orderinfo t) {
		t.setCreateTime(DateUtils.getNowDateTime());
		t.setoId(IdUtils.waterId());
		t.setStatus(0);
		return orderMapper.insert(t);
	}

	@Override
	public int update(Orderinfo t) {
		return orderMapper.update(t);
	}

	@Override
	public int remove(String id) {
		return orderMapper.delete(id);
	}

	@Override
	public Orderinfo get(String id) {
		return orderMapper.select(id);
	}

	@Override
	public List<Orderinfo> getList(Map<String, Object> params) {
		return orderMapper.selectList(params);
	}

	@Override
	public int getCount(Map<String, Object> params) {
		return orderMapper.selectCount(params);
	}

}
