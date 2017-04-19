package com.bs.tenement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.tenement.bean.Goods;
import com.bs.tenement.bean.Tools;
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
		query.setLimit(100);
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
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public RestResult update(Goods goods){
		
		int result = goodsService.update(goods);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("更新失败");
		
	}
	
	@RequestMapping(value = "/rm/{id}", method = RequestMethod.GET)
	public RestResult remove(@PathVariable("id") String id){
		int result = goodsService.remove(id);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("删除失败");
	}
}
