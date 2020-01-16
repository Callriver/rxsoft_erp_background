package com.rxsoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rxsoft.bean.Attribute;
import com.rxsoft.bean.AttributeClassify;

public interface ProductAttributeMapper {
	List<AttributeClassify> findClassifyById(@Param("product_id")int product_id);
	List<Attribute> findAttributeById(@Param("product_id")int product_id,@Param("classify_id") int classify_id);
    int addProductAttribute(@Param("classify_id")int classify_id,@Param("product_id")int product_id,@Param("attribute_id")int attribute_id);
    int updProductAttribute(@Param("classify_id")int classify_id,@Param("product_id")int product_id,@Param("attribute_id")int attribute_id,
    		@Param("oldclassify_id")int oldclassify_id,@Param("oldproduct_id")int oldproduct_id,@Param("oldattribute_id")int oldattribute_id);
}
