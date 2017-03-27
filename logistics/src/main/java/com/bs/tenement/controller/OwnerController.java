package com.bs.tenement.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.tenement.bean.Complain;
import com.bs.tenement.query.Query;
import com.bs.tenement.rest.Rest;
import com.bs.tenement.rest.RestResult;
import com.bs.tenement.service.OrderinfoService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
@RequestMapping("/complain")
public class OwnerController {

	@Autowired
	private OrderinfoService comService;
	
	@RequestMapping(value = "/{page}", method = RequestMethod.GET)
	public String page(@PathVariable("page") String page, String comId, ModelMap modelMap){
		if(StringUtils.isNotBlank(comId)){
			modelMap.addAttribute("complain", comService.get(comId));
		}
		modelMap.addAttribute("page", "complain");
		return page;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public String list(Query query) throws JsonProcessingException{
		
		Map<String, Object> params = query.toMap();
		List<Complain> stuList = comService.getList(params);
		int count = comService.getCount(params);
		
		Rest<Complain> rest = new Rest<Complain>(count, stuList);
		return rest.toJson();
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@ResponseBody
	public RestResult edit(Complain course, ModelMap modelMap){
		
		int result = 0;
		if(StringUtils.isNotBlank(course.getComId())){
			result = comService.update(course);
		}else{
			result = comService.add(course);
		}
		if(result > 0){
			return RestResult.success().setInfo("成功");
		}
		
		return RestResult.error("失败");
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	@ResponseBody
	public RestResult remove(String comId, ModelMap map){
		int result = comService.remove(comId);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("失败");
	}
	
}
