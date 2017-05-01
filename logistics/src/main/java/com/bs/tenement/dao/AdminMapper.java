package com.bs.tenement.dao;

import org.apache.ibatis.annotations.Param;

import com.bs.tenement.bean.Admin;

public interface AdminMapper extends BaseMapper<Admin>{
   
    Admin selectBy(@Param("name") String name, @Param("password") String password);
    
    int insert(Admin admin);
}