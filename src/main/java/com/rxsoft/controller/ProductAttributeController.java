package com.rxsoft.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rxsoft.bean.Attribute;
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
	@RequestMapping(value="/attribute-list",method = RequestMethod.POST)
	/**
	 * 根据商品id分类id查询该商品分类下的属性
	 * @param product_id
	 * @param classify_id
	 * @return
	 */
	public JsonRespObj findAttributeById(@RequestParam("product_id")int product_id,@RequestParam("classify_id")int classify_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		List<Attribute> list = service.findAttributeById(product_id, classify_id);
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
	@RequestMapping(value = "attribute-add",method = RequestMethod.POST)
	/**
	 * 增加商品属性
	 * @param classify_id
	 * @param product_id
	 * @param attribute_id
	 * @return
	 */
	public JsonRespObj addProductAttribute(@RequestParam("classify_id")int classify_id,@RequestParam("product_id")int product_id,@RequestParam("attribute_id")int attribute_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		int i = service.addProductAttribute(classify_id, product_id, attribute_id);
		if (i!=0) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("i");
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
	@RequestMapping(value = "attribute-upd",method = RequestMethod.POST)
	/**
	 * 修改商品属性
	 * @param classify_id
	 * @param product_id
	 * @param attribute_id
	 * @param oldclassify_id
	 * @param oldproduct_id
	 * @param oldattribute_id
	 * @return
	 */
	public JsonRespObj updProductAttribute(@RequestParam("classify_id")int classify_id,@RequestParam("product_id")int product_id,@RequestParam("attribute_id")int attribute_id,
			@RequestParam("oldclassify_id")int oldclassify_id,@RequestParam("oldproduct_id")int oldproduct_id,@RequestParam("oldattribute_id")int oldattribute_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		int i = service.updProductAttribute(classify_id, product_id, attribute_id,oldclassify_id,oldproduct_id,oldattribute_id);
		if (i!=0) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("i");
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
	@RequestMapping(value = "attribute-del",method = RequestMethod.POST)
	/**
	 * 删除商品属性
	 * @param classify_id
	 * @param product_id
	 * @param attribute_id
	 * @param oldclassify_id
	 * @param oldproduct_id
	 * @param oldattribute_id
	 * @return
	 */
	public JsonRespObj delProductAttribute(@RequestParam("classify_id")int classify_id,@RequestParam("product_id")int product_id,@RequestParam("attribute_id")int attribute_id) {
		JsonRespObj jsonObj=new JsonRespObj();
		int i = service.delProductAttribute(classify_id, product_id, attribute_id);
		if (i!=0) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("i");
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("");
		}
		return jsonObj;
	}
}
