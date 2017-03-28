package com.bs.tenement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.tenement.bean.Way;
import com.bs.tenement.query.WayQuery;
import com.bs.tenement.rest.RestResult;
import com.bs.tenement.service.WayService;

@RestController
@RequestMapping("/way")
public class WayController {

	@Autowired
	private WayService wayService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResult list(WayQuery query){
		return RestResult.success().setResponse(wayService.getList(query.toMap()));
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public RestResult add(Way way){
		 int result = wayService.add(way);
		 if(result > 0){
			 return RestResult.success();
		 }
		 return RestResult.error("添加失败");
	}
}
