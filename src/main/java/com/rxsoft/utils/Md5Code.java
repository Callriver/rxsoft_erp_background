package com.rxsoft.utils;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Encoder;
public class Md5Code {

	public static String createMd5Code(String code) throws Exception {
		// 获取Md5对象
		MessageDigest digest = MessageDigest.getInstance("MD5");
		//字符串转换成hashcode值ֵ
		byte[] b=digest.digest(code.getBytes());
		//base64算法
		Encoder encoder = Base64.getEncoder();
		String result=new String(encoder.encode(b));
		return result;
	}
	public static void main(String[] args) throws Exception {
		String code = Md5Code.createMd5Code("123456");
		System.out.println(code);
	}

}
