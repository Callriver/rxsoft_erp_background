package com.rxsoft.bean;

import java.math.BigDecimal;
import java.sql.Date;

public class Product {
	private int product_id;	//商品编码
	private String product_name;//商品名称
	private BigDecimal product_retailprice;//零售价
	private BigDecimal product_costprice;//进货价
	private BigDecimal product_deliveryprice;//批发价
	private String product_unit;//单位
	private String product_image;//图片路径
	private int commodity_group;//商品组
	private Date entry_date;//录入时间
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public BigDecimal getProduct_retailprice() {
		return product_retailprice;
	}
	public void setProduct_retailprice(BigDecimal product_retailprice) {
		this.product_retailprice = product_retailprice;
	}
	public BigDecimal getProduct_costprice() {
		return product_costprice;
	}
	public void setProduct_costprice(BigDecimal product_costprice) {
		this.product_costprice = product_costprice;
	}
	public BigDecimal getProduct_deliveryprice() {
		return product_deliveryprice;
	}
	public void setProduct_deliveryprice(BigDecimal product_deliveryprice) {
		this.product_deliveryprice = product_deliveryprice;
	}
	public String getProduct_unit() {
		return product_unit;
	}
	public void setProduct_unit(String product_unit) {
		this.product_unit = product_unit;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public int getCommodity_group() {
		return commodity_group;
	}
	public void setCommodity_group(int commodity_group) {
		this.commodity_group = commodity_group;
	}
	public Date getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Date entry_date) {
		this.entry_date = entry_date;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_retailprice="
				+ product_retailprice + ", product_costprice=" + product_costprice + ", product_deliveryprice="
				+ product_deliveryprice + ", product_unit=" + product_unit + ", product_image=" + product_image
				+ ", commodity_group=" + commodity_group + ", entry_date=" + entry_date + "]";
	}
	public Product(int product_id, String product_name, BigDecimal product_retailprice, BigDecimal product_costprice,
			BigDecimal product_deliveryprice, String product_unit, String product_image, int commodity_group,
			Date entry_date) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_retailprice = product_retailprice;
		this.product_costprice = product_costprice;
		this.product_deliveryprice = product_deliveryprice;
		this.product_unit = product_unit;
		this.product_image = product_image;
		this.commodity_group = commodity_group;
		this.entry_date = entry_date;
	}


}
