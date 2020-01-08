package com.rxsoft.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.json.JSONUtils;
import com.rxsoft.bean.AttributeClassify;
import com.rxsoft.bean.JsonRespObj;
import com.rxsoft.service.AttributeClassifyService;
import com.rxsoft.service.AttributeService;

/**
 * 商品属性控制层
 * @author lijunqiang
 *
 */
@RestController
@RequestMapping(value = "/attribute")
@MapperScan("com.rxsoft.dao")
public class AttributeController {
	@Autowired
	AttributeService service;
	@Autowired
	AttributeClassifyService classifyService;
	@RequestMapping(value="/attribute-update" ,method = RequestMethod.POST)
	/**
	 * 根据属性id更新属性信息
	 * @param attribute_id
	 * @param attribute_name
	 * @param classify_id
	 * @return
	 */
	public JsonRespObj updateAttribute(@RequestParam("attribute_id") int attribute_id,@RequestParam("attribute_name") String attribute_name,@RequestParam("classify_id") int classify_id) {
		int i = service.update(classify_id, attribute_name, classify_id);
		JsonRespObj jsonObj=new JsonRespObj();
		if (i==1) {
			jsonObj.setStatus_code(0);
			jsonObj.setMsg("Success");
			jsonObj.setData("Success");
			
		}else {
			jsonObj.setStatus_code(99);
			jsonObj.setMsg("Service Unavailable");
			jsonObj.setData("Service Unavailable");
		}
		return jsonObj;
	}
	@RequestMapping(value="/attributeclassify-list" ,method = RequestMethod.POST)
	/**
	 * 查询所有属性分类
	 * @return
	 */
	public JsonRespObj listAttributeClassify() {
		List<AttributeClassify> list = classifyService.list();
		JsonRespObj jsonObj=new JsonRespObj();
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
	@RequestMapping(value="/attributeclassify-add" ,method = RequestMethod.POST)
	public JsonRespObj addAttributeClassify(@RequestParam("classify_id")int classify_id,@RequestParam("classify_name") String classify_name) {
		int i = classifyService.add(classify_id, classify_name);
		JsonRespObj jsonObj;
		if (i==1) {
			jsonObj=new JsonRespObj(0,"Success","Success");
		}else {
			jsonObj=new JsonRespObj(99,"Service Unavailable","");
		}
		return jsonObj;
	}
}
