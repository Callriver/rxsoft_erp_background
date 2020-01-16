package com.rxsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxsoft.bean.Attribute;
import com.rxsoft.bean.AttributeClassify;
import com.rxsoft.dao.ProductAttributeMapper;

/**
 * 商品属性维护
 * @author Administrator
 *
 */
@Service
public class ProductAttributeService {
	@Autowired
	ProductAttributeMapper mapper;
	public List<AttributeClassify>  findClassifyById(int product_id) {
		return mapper.findClassifyById(product_id);
	}
	public List<Attribute>  findAttributeById(int product_id,int classify_id) {
		return mapper.findAttributeById(product_id, classify_id);
	}
	public int  addProductAttribute(int classify_id,int product_id,int attribute_id) {
		return mapper.addProductAttribute(classify_id, product_id, attribute_id);
	}
	public int  updProductAttribute(int classify_id,int product_id,int attribute_id,int oldclassify_id,int oldproduct_id,int oldattribute_id) {
		return mapper.updProductAttribute(classify_id, product_id, attribute_id,oldclassify_id,oldproduct_id,oldattribute_id);
	}
}
