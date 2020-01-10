package com.rxsoft.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertUtil {
	 public static java.sql.Date strToDate (String str){
	        //2018-09-06 19:07:27
	      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	      Date d = new Date();
	      try {
	          d = dateFormat.parse(str);
	          //System.out.println(date.getTime());
	      } catch (ParseException e) {
	          e.printStackTrace();
	      }
	      java.sql.Date date=new java.sql.Date(d.getTime());
	      return date;
	  }
}
