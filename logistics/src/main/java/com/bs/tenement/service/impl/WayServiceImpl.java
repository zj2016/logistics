package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Orderinfo;
import com.bs.tenement.bean.Way;
import com.bs.tenement.dao.OrderinfoMapper;
import com.bs.tenement.dao.WayMapper;
import com.bs.tenement.service.WayService;
import com.bs.tenement.utils.DateUtils;
import com.bs.tenement.utils.IdUtils;

@Service
public class WayServiceImpl implements WayService{

	@Autowired
	private WayMapper wayMapper;
	@Autowired
	private OrderinfoMapper orderMapper;
	
	@Override
	public int add(Way t) {
		Integer status = 1;
		if(StringUtils.isBlank(t.getAddr())){
			t.setAddr("签收");
			status = 3;
		}
		t.setCreateTime(DateUtils.getNowDateTime());
		t.setwNo(IdUtils.id());
		int res = wayMapper.insert(t);
		if(res > 0){
			Orderinfo order = new Orderinfo();
			order.setoId(t.getoId());
			order.setStatus(status);
			return orderMapper.update(order);
		}
		return res;
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
