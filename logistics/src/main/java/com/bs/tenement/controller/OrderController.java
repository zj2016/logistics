package com.bs.tenement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bs.tenement.bean.Orderinfo;
import com.bs.tenement.query.OrderQuery;
import com.bs.tenement.query.Query;
import com.bs.tenement.rest.RestResult;
import com.bs.tenement.service.OrderinfoService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderinfoService orderService;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResult list(OrderQuery query){
		
		List<Orderinfo> orderList = orderService.getList(query.toMap());
		int count = orderService.getCount(query.toMap());
		return RestResult.success().setResponse(orderList).setInfo(""+count);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public RestResult add(Orderinfo order){
		
		int result = orderService.add(order);
		if(result > 0){
			return RestResult.success().setInfo("成功");
		}
		
		return RestResult.error("失败");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public RestResult get(@PathVariable("id") String id){
		return RestResult.success().setResponse(orderService.get(id));
	}
	
	/*@RequestMapping(value = "/remove", method = RequestMethod.GET)
	@ResponseBody
	public RestResult remove(String comId, ModelMap map){
		int result = comService.remove(comId);
		if(result > 0){
			return RestResult.success();
		}
		return RestResult.error("失败");
	}*/
	
}
