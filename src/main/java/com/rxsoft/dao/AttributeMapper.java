package com.rxsoft.dao;

import org.apache.ibatis.annotations.Param;

import com.rxsoft.bean.Attribute;
/**
 * 属性的dao映射
 * @author lijunqiang
 *
 */
public interface AttributeMapper {
	/**
	 * 更新属性
	 * @param attribute_id 属性id
	 * @param attribute_name 属性名
	 * @param classify_id 属性类
	 * @return 返回值为0,失败;为1则代表成功
	 */
	int update (@Param("attribute_id") int attribute_id,@Param("attribute_name") String attribute_name,@Param("classify_id") int classify_id) ;
}
