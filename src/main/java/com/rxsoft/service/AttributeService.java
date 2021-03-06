package com.rxsoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rxsoft.bean.Attribute;
import com.rxsoft.dao.AttributeClassifyMapper;
import com.rxsoft.dao.AttributeMapper;

@Service
public class AttributeService {
	@Autowired
	AttributeMapper mapper;
	/**
	 * 更新商品属性
	 * @param attribute_id 属性id
	 * @param attribute_name 属性名称
	 * @param classify_id 属性类别id
	 * @return 返回0失败返回1成功
	 */
	@Transactional
	public int update(int attribute_id,String attribute_name,int classify_id) {
		return mapper.update(attribute_id,attribute_name,classify_id);
	} 
	public List<Attribute> list(int classify_id) {
		return mapper.list(classify_id);
	} 
	@Transactional
	public int add(int attribute_id,String attribute_name,int classify_id) {
		return mapper.add(attribute_id,attribute_name,classify_id);
	} 
	@Transactional
	public int delete(int attribute_id,int classify_id) {
		return mapper.delete(attribute_id,classify_id);
	} 
}
