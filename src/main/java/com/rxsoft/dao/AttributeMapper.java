package com.rxsoft.dao;

import java.util.List;

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
	/**
	 * 根据分类id查属性
	 * @param classify_id
	 * @return
	 */
	List<Attribute> list(@Param("classify_id")int classify_id); 
	/**
	 * 根据分类id增加属性
	 * @param attribute_id
	 * @param attribute_name
	 * @param classify_id
	 * @return
	 */
	int add(@Param("attribute_id")int attribute_id,@Param("attribute_name")String attribute_name,@Param("classify_id")int classify_id);
	/**
	 * 根据属性id删除属性
	 * @param attribute_id
	 * @return
	 */
	int delete(@Param("attribute_id")int attribute_id,@Param("classify_id")int classify_id); 
}
