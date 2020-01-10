package com.rxsoft.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rxsoft.bean.Product;
/**
 * 
 * @author lijunqiang
 *
 */
public interface ProductMapper {
	List<Product> list();
	Product findProductById(@Param("product_id") int product_id);
	int add(@Param("product_id")int product_id,@Param("product_name")String product_name,@Param("product_retailprice")BigDecimal product_retailprice,@Param("product_costprice")BigDecimal product_costprice,@Param("product_deliveryprice")BigDecimal product_deliveryprice,@Param("product_unit")int product_unit,@Param("product_image")String product_image,@Param("commodity_group")int commodity_group,@Param("entry_date")Date entry_date);
	int update(@Param("product_id")int product_id,@Param("product_name")String product_name,@Param("product_retailprice")BigDecimal product_retailprice,@Param("product_costprice")BigDecimal product_costprice,@Param("product_deliveryprice")BigDecimal product_deliveryprice,@Param("product_unit")int product_unit,@Param("product_image")String product_image,@Param("commodity_group")int commodity_group,@Param("entry_date")Date entry_date);
	int delete(@Param("product_id") int product_id);
}
