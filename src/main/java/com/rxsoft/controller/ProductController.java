package com.rxsoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rxsoft.bean.JsonRespObj;
import com.rxsoft.bean.Product;
import com.rxsoft.bean.ProductBasic;
import com.rxsoft.service.ProductService;

@RestController
@RequestMapping(value="/product")
@MapperScan("com.rxsoft.dao")
public class ProductController {
	@Autowired
	ProductService service;
	@RequestMapping(value="/product-list",method = RequestMethod.POST)
	public JsonRespObj listProduct() {
		JsonRespObj jsonObj=new JsonRespObj();
		List<ProductBasic> b=new ArrayList<ProductBasic>();
		List<Product> list=service.list();
		for (Product product : list) {
			b.add(new ProductBasic(product.getProduct_id(), product.getProduct_name()));
		}
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
