package com.bs.tenement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.tenement.bean.Tools;
import com.bs.tenement.query.ToolsQuery;
import com.bs.tenement.rest.RestResult;
import com.bs.tenement.rest.RestResultList;
import com.bs.tenement.service.ToolsService;

@RestController
@RequestMapping("/tools")
public class ToolsController {

	@Autowired
	private ToolsService toolService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResult list(ToolsQuery query){
		return RestResult.success().setResponse(toolService.getList(query.toMap()));
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public RestResult get(@PathVariable("id") String id){
		return RestResult.success().setResponse(toolService.get(id));
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public RestResult update(Tools tools){
		
		int result = toolService.update(tools);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("更新失败");
		
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public RestResult add(Tools tools){
		
		int result = toolService.add(tools);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("添加失败");
	}
	
	@RequestMapping(value = "/rm/{id}", method = RequestMethod.POST)
	public RestResult remove(@PathVariable("id") String id){
		int result = toolService.remove(id);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("删除失败");
	}
}
