package com.bs.tenement.service;

import com.bs.tenement.bean.Admin;

public interface AdminService {

	Admin login(String name, String password);
	
}
