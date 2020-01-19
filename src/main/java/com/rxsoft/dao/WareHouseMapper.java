package com.rxsoft.dao;

import java.util.List;

import com.rxsoft.bean.WareHouse;

public interface WareHouseMapper {
	List<WareHouse> findWareHouseByDepartmentId(int department_id);
	WareHouse findWareHouseById(int warehouse_id);
}
