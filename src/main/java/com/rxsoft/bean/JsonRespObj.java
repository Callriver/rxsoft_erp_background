package com.rxsoft.bean;

public class JsonRespObj {
	private int status_code;
	private String msg;
	private Object data;
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonRespObj [status_code=" + status_code + ", msg=" + msg + ", data=" + data + "]";
	}
	public JsonRespObj(int status_code, String msg, Object data) {
		super();
		this.status_code = status_code;
		this.msg = msg;
		this.data = data;
	}
	public JsonRespObj() {
	}
	
}
