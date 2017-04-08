package com.bs.tenement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.tenement.bean.Goods;
import com.bs.tenement.query.Query;
import com.bs.tenement.rest.RestResult;
import com.bs.tenement.service.GoodsService;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResult list(Query query){
		return RestResult.success().setResponse(goodsService.getList(query.toMap()));
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public RestResult add(Goods goods){
		 int result = goodsService.add(goods);
		 if(result > 0){
			 return RestResult.success();
		 }
		 return RestResult.error("添加失败");
	}
}
