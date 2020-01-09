package com.rxsoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rxsoft.bean.AttributeClassify;

/**
 * 属性类dao映射
 * @author lijunqiang
 *
 */
public interface AttributeClassifyMapper {
	List<AttributeClassify> list();
	int add(@Param("classify_id") int classify_id,@Param("classify_name")String classify_name);
	int delete(@Param("classify_id") int classify_id);
	int update(@Param("classify_id") int classify_id,@Param("classify_name")String classify_name);
}
