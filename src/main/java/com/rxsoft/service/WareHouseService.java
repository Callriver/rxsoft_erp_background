package com.rxsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxsoft.bean.WareHouse;
import com.rxsoft.dao.WareHouseMapper;

@Service
public class WareHouseService {
	@Autowired
	WareHouseMapper mapper;
	public List<WareHouse> findWareHouseByDepartmentId(int department_id){
		return mapper.findWareHouseByDepartmentId(department_id);
	}
	public WareHouse findWareHouseById(int warehouse_id){
		return mapper.findWareHouseById(warehouse_id);
	}
	
}
