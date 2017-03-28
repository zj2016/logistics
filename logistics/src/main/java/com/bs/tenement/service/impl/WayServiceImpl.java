package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Way;
import com.bs.tenement.dao.WayMapper;
import com.bs.tenement.service.WayService;
import com.bs.tenement.utils.DateUtils;
import com.bs.tenement.utils.IdUtils;

@Service
public class WayServiceImpl implements WayService{

	@Autowired
	private WayMapper wayMapper;
	
	@Override
	public int add(Way t) {
		t.setCreateTime(DateUtils.getNowDateTime());
		t.setwNo(IdUtils.id());
		return wayMapper.insert(t);
	}

	@Override
	public int update(Way t) {
		return wayMapper.update(t);
	}

	@Override
	public int remove(String id) {
		return wayMapper.delete(id);
	}

	@Override
	public Way get(String id) {
		return wayMapper.select(id);
	}

	@Override
	public List<Way> getList(Map<String, Object> params) {
		return wayMapper.selectList(params);
	}

	@Override
	public int getCount(Map<String, Object> params) {
		return wayMapper.selectCount(params);
	}

}
