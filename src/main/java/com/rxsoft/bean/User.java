package com.rxsoft.bean;

import java.sql.Date;

public class User {
	private String userid;
	private String username;
	private String password;
	private int position_id;
	private int department_id;
	private String is_departure;
	private String wx_id;
	private String telephone;
	private String address;
	private Date hiredate;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getIs_departure() {
		return is_departure;
	}
	public void setIs_departure(String is_departure) {
		this.is_departure = is_departure;
	}
	public String getWx_id() {
		return wx_id;
	}
	public void setWx_id(String wx_id) {
		this.wx_id = wx_id;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public User(String userid, String username, String password, int position_id, int department_id, String is_departure,
			String wx_id, String telephone, String address, Date hiredate) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.position_id = position_id;
		this.department_id = department_id;
		this.is_departure = is_departure;
		this.wx_id = wx_id;
		this.telephone = telephone;
		this.address = address;
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", position_id="
				+ position_id + ", department_id=" + department_id + ", is_departure=" + is_departure + ", wx_id="
				+ wx_id + ", telephone=" + telephone + ", address=" + address + ", hiredate=" + hiredate + "]";
	}
	
}
