package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Tools;
import com.bs.tenement.dao.ToolsMapper;
import com.bs.tenement.service.ToolsService;
import com.bs.tenement.utils.IdUtils;

@Service
public class ToolsServiceImpl implements ToolsService{

	@Autowired
	private ToolsMapper toolMapper;
	
	@Override
	public int add(Tools t) {
		t.settNo(IdUtils.id());
		return toolMapper.insert(t);
	}

	@Override
	public int update(Tools t) {
		return toolMapper.update(t);
	}

	@Override
	public int remove(String id) {
		return toolMapper.delete(id);
	}

	@Override
	public Tools get(String id) {
		return toolMapper.select(id);
	}

	@Override
	public List<Tools> getList(Map<String, Object> params) {
		return toolMapper.selectList(params);
	}

	@Override
	public int getCount(Map<String, Object> params) {
		return toolMapper.selectCount(params);
	}

}
