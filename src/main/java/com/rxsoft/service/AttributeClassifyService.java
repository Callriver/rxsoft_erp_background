package com.rxsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxsoft.bean.AttributeClassify;
import com.rxsoft.dao.AttributeClassifyMapper;

@Service
public class AttributeClassifyService {
	@Autowired
	AttributeClassifyMapper mapper;
	public List<AttributeClassify> list() {
		return mapper.list();
	}
	public int add(int classify_id,String classify_name) {
		return mapper.add(classify_id, classify_name);
	}
	public int delete(int classify_id) {
		return mapper.delete(classify_id);
	}
	public int update(int classify_id,String classify_name) {
		return mapper.update(classify_id,classify_name);
	}
}
