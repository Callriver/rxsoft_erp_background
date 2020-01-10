package com.rxsoft.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rxsoft.bean.AttributeClassify;
import com.rxsoft.bean.JsonRespObj;
import com.rxsoft.service.ProductAttributeService;

@RestController()
@RequestMapping("/productattribute")
@MapperScan("com.rxsoft.dao")
/**
 * 商品属性维护
 * @author Administrator
 *
 */
public class ProductAttributeController {
	@Autowired
	ProductAttributeService service;
	@RequestMapping(value="/classify-list",method = RequestMethod.POST)
	/**
	 * 根据商品id查询该商品所有属性分类
	 * @param product_id
	 * @return
	 */
	public JsonRespObj findClassifyById(@RequestParam("product_id")int product_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		List<AttributeClassify> list = service.findClassifyById(product_id);
		if (list!=null) {
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
}
