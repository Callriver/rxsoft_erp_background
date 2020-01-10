package com.rxsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
