package com.bs.tenement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.tenement.bean.Admin;
import com.bs.tenement.rest.RestResult;
import com.bs.tenement.service.AdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public RestResult login(String name, String password, HttpServletRequest request){
		
		Admin admin = adminService.login(name, password);
		
		if(admin == null){
			return RestResult.error("用户名密码不匹配");
		}
		
		request.getSession().setAttribute("_admin", admin);
		
		return RestResult.success();
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("_admin");
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public RestResult add(Admin admin){
		int result = adminService.add(admin);
		if(result > 0) {
			return RestResult.success();
		}
		return RestResult.error("增加失败");
	}
	
}
