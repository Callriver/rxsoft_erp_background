package com.rxsoft.bean;
/**
 * 商品属性分类
 * @author ljq
 *
 */
public class AttributeClassify {
	private int classify_id;//分类id
	private String classify_name;//分类名称
	public int getClassify_id() {
		return classify_id;
	}
	public void setClassify_id(int classify_id) {
		this.classify_id = classify_id;
	}
	public String getClassify_name() {
		return classify_name;
	}
	public void setClassify_name(String classify_name) {
		this.classify_name = classify_name;
	}
	@Override
	public String toString() {
		return "AttributeClassify [classify_id=" + classify_id + ", classify_name=" + classify_name + "]";
	}
	
}
