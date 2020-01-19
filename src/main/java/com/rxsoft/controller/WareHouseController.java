package com.rxsoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rxsoft.bean.JsonRespObj;
import com.rxsoft.bean.Product;
import com.rxsoft.bean.ProductBasic;
import com.rxsoft.bean.WareHouse;
import com.rxsoft.service.WareHouseService;

@RestController
@RequestMapping(value="/warehouse")
@MapperScan("com.rxsoft.dao")
public class WareHouseController {
	@Autowired
	WareHouseService service;
	@RequestMapping(value="/warehouse-list",method = RequestMethod.POST)
	public JsonRespObj findWareHouseByDepartmentId(@RequestParam("department_id")int department_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		List<WareHouse> list = service.findWareHouseByDepartmentId(department_id);
		if (!list.isEmpty()) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData(list);
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
	@RequestMapping(value="/warehouse-find",method = RequestMethod.POST)
	public JsonRespObj findWareHouseById(@RequestParam("warehouse_id")int warehouse_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		WareHouse warehouse = service.findWareHouseById(warehouse_id);
		if (warehouse!=null) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData(warehouse);
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
}
