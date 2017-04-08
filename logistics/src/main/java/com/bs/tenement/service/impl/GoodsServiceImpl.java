package com.bs.tenement.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Goods;
import com.bs.tenement.dao.GoodsMapper;
import com.bs.tenement.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public int add(Goods t) {
		return goodsMapper.insert(t);
	}

	@Override
	public int update(Goods t) {
		
		return goodsMapper.update(t);
	}

	@Override
	public int remove(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Goods get(String id) {
		
		return goodsMapper.select(id);
	}

	@Override
	public List<Goods> getList(Map<String, Object> params) {
		
		return goodsMapper.selectList(params);
	}

	@Override
	public int getCount(Map<String, Object> params) {
		
		return goodsMapper.selectCount(params);
	}

}
