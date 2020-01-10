package com.rxsoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rxsoft.bean.AttributeClassify;

public interface ProductAttributeMapper {
	List<AttributeClassify> findClassifyById(@Param("product_id")int product_id);
}
