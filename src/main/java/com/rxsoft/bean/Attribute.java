package com.rxsoft.bean;
/**
 * 商品属性
 * @author lijunqiang
 *
 */
public class Attribute {
	private int attribute_id;//属性id
	private String attribute_name;//属性名称
	private int classify_id;//属性分类id
	public int getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(int attribute_id) {
		this.attribute_id = attribute_id;
	}
	public String getAttribute_name() {
		return attribute_name;
	}
	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}
	public int getClassify_id() {
		return classify_id;
	}
	public void setClassify_id(int classify_id) {
		this.classify_id = classify_id;
	}
	@Override
	public String toString() {
		return "Attribute [attribute_id=" + attribute_id + ", attribute_name=" + attribute_name + ", classify_id="
				+ classify_id + "]";
	}
	public Attribute(int attribute_id, String attribute_name, int classify_id) {
		super();
		this.attribute_id = attribute_id;
		this.attribute_name = attribute_name;
		this.classify_id = classify_id;
	}
	
}
