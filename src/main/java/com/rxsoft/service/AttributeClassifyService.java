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
}
