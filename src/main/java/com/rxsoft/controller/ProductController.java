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
	@RequestMapping(value="/product-find",method = RequestMethod.POST)
	/**
	 * 通过商品id查商品
	 * @param product_id
	 * @return
	 */
	public JsonRespObj findProductById(@RequestParam("product_id")int product_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		Product product = service.findProductById(product_id);
		if (product!=null) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData(product);
			
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
	
	@RequestMapping(value="/product-add",method = RequestMethod.POST)
	public JsonRespObj addProduct(@RequestParam("product_id")int product_id,@RequestParam("product_name")String product_name,
			@RequestParam("product_retailprice")BigDecimal product_retailprice,@RequestParam("product_costprice")BigDecimal product_costprice,
			@RequestParam("product_deliveryprice")BigDecimal product_deliveryprice,@RequestParam("product_unit")int product_unit,
			@RequestParam("product_image")MultipartFile product_image,@RequestParam("commodity_group")int commodity_group,@RequestParam("entry_date") String entry_date) {
		JsonRespObj jsonObj=new JsonRespObj();
		int i=service.add(product_id,product_name,product_retailprice,product_costprice,
				product_deliveryprice,product_unit,product_image,commodity_group,entry_date);
		if (i==1) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("");
			
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
	@RequestMapping(value="/product-upd",method = RequestMethod.POST)
	/**
	 * 根据商品id修改商品信息
	 * @param product_id
	 * @param product_name
	 * @param product_retailprice
	 * @param product_costprice
	 * @param product_deliveryprice
	 * @param product_unit
	 * @param product_image
	 * @param commodity_group
	 * @param entry_date
	 * @return
	 */
	public JsonRespObj updProduct(@RequestParam("product_id")int product_id,@RequestParam("product_name")String product_name,
			@RequestParam("product_retailprice")BigDecimal product_retailprice,@RequestParam("product_costprice")BigDecimal product_costprice,
			@RequestParam("product_deliveryprice")BigDecimal product_deliveryprice,@RequestParam("product_unit")int product_unit,
			@RequestParam("product_image")MultipartFile product_image,@RequestParam("commodity_group")int commodity_group,@RequestParam("entry_date") String entry_date) {
		JsonRespObj jsonObj=new JsonRespObj();
		int i=service.update(product_id,product_name,product_retailprice,product_costprice,
				product_deliveryprice,product_unit,product_image,commodity_group,entry_date);
		if (i==1) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("");
			
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
	@RequestMapping(value="/product-del",method = RequestMethod.POST)
	/**
	 * 通过商品id删商品
	 * @param product_id
	 * @return
	 */
	public JsonRespObj delProductById(@RequestParam("product_id")int product_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		int i = service.delete(product_id);
		if (i==1) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("");
			
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
}
