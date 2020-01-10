package com.rxsoft.service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rxsoft.bean.Product;
import com.rxsoft.dao.ProductMapper;
import com.rxsoft.utils.DateConvertUtil;

@Service
public class ProductService {
	@Autowired
	ProductMapper mapper;
	public List<Product> list(){
		return mapper.list();
	}
	public Product findProductById(int product_id){
		return mapper.findProductById(product_id);
	}
	public int add(int product_id,String product_name,
			BigDecimal product_retailprice,BigDecimal product_costprice,
			BigDecimal product_deliveryprice,int product_unit,
			MultipartFile product_image,int commodity_group,String entry_date){
		//写图片文件
		
		//写数据库
		return mapper.add(product_id,product_name,product_retailprice,product_costprice,
				product_deliveryprice,product_unit,product_image.getName(),commodity_group,DateConvertUtil.strToDate(entry_date));
	}
	public int update(int product_id,String product_name,
			BigDecimal product_retailprice,BigDecimal product_costprice,
			BigDecimal product_deliveryprice,int product_unit,
			MultipartFile product_image,int commodity_group,String entry_date){
		//写图片文件
		
		//写数据库
		return mapper.update(product_id,product_name,product_retailprice,product_costprice,
				product_deliveryprice,product_unit,product_image.getName(),commodity_group,DateConvertUtil.strToDate(entry_date));
	}
	public int delete(int product_id){
		//删图片文件
		
		//写数据库
		return mapper.delete(product_id);
	}
}
