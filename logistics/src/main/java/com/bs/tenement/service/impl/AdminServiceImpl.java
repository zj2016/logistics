package com.bs.tenement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.tenement.bean.Admin;
import com.bs.tenement.dao.AdminMapper;
import com.bs.tenement.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adminMapper;

	public Admin login(String name, String password) {
		return adminMapper.selectBy(name, password);
	}

}
