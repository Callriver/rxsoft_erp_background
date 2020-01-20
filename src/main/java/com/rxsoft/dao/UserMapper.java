package com.rxsoft.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;

import com.rxsoft.bean.User;


public interface UserMapper {

	User login(@Param("userid")String userid,@Param("password")String password);
}
