package com.rxsoft.bean;

public class WareHouse {
	private int warehouse_id;
	private String warehouse_name;
	private int department_id;
	private String warehouse_address;
	private boolean is_default;
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getWarehouse_address() {
		return warehouse_address;
	}
	public void setWarehouse_address(String warehouse_address) {
		this.warehouse_address = warehouse_address;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	@Override
	public String toString() {
		return "warehouse [warehouse_id=" + warehouse_id + ", warehouse_name=" + warehouse_name + ", department_id="
				+ department_id + ", warehouse_address=" + warehouse_address + ", is_default=" + is_default + "]";
	}
	public WareHouse(int warehouse_id, String warehouse_name, int department_id, String warehouse_address,
			boolean is_default) {
		super();
		this.warehouse_id = warehouse_id;
		this.warehouse_name = warehouse_name;
		this.department_id = department_id;
		this.warehouse_address = warehouse_address;
		this.is_default = is_default;
	}
	
}
