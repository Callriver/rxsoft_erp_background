package com.rxsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxsoft.bean.Product;
import com.rxsoft.dao.ProductMapper;

@Service
public class ProductService {
	@Autowired
	ProductMapper mapper;
	public List<Product> list(){
		return mapper.list();
	}
}
