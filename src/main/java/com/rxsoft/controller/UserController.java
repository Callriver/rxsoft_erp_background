package com.rxsoft.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rxsoft.bean.JsonRespObj;
import com.rxsoft.bean.Product;
import com.rxsoft.bean.ProductBasic;
import com.rxsoft.bean.User;
import com.rxsoft.service.ProductService;
import com.rxsoft.service.UserService;

@RestController
@RequestMapping(value="/user")
@MapperScan("com.rxsoft.dao")
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public JsonRespObj userLogin(@RequestParam("userid")String userid,@RequestParam("password")String password)  {
		JsonRespObj jsonObj=new JsonRespObj();
		User user=service.login(userid, password);
		if (user!=null) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("login success");
			jsonObj.setData(user);
			
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("login defail");
			jsonObj.setData("");
		}
		return jsonObj;
	}
}
