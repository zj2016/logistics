package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Tools;
import com.bs.tenement.dao.ToolsMapper;
import com.bs.tenement.service.ToolsService;

@Service
public class ToolsServiceImpl implements ToolsService{

	@Autowired
	private ToolsMapper toolMapper;
	
	@Override
	public int add(Tools t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Tools t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Tools get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tools> getList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

}
