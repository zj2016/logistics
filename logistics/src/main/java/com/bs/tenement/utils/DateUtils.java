package com.bs.tenement.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * 
 *@author jon
 *@date 2016楠烇�?11閺堬�?30閺冿�? 娑撳宕�?4:29:19
 *@desc 閺冨爼妫块幙宥勭稊�?�搞儱鍙跨猾锟�
 */
public class DateUtils {

	public enum DatePattern{
		
		yyyyMMddHHmmss("yyyyMMddHHmmss"),
		
		yyyy_MM_dd("yyyy-MM-dd"),
		
		yyyy_MM_dd_HH_mm_ss("yyyy-MM-dd HH:mm:ss"),
		
		yyyyMMddHHmmssSSS("yyyyMMddHHmmssSSS");
	
		private String pattern;
		public String getPattern() {
			return pattern;
		}
		private DatePattern(String pattern){
			this.pattern = pattern;
		}
		
	}
	
	public static Long getNowDateTime(){
		return System.currentTimeMillis()/1000;
	}
	
	public static String getNowDateTimeYMDHMS(){
		return getNowDateTime(DatePattern.yyyyMMddHHmmss);
	}
	
	public static String getNowDateTime(DatePattern pattern){
		Date date = new Date();
		SimpleDateFormat fm = new SimpleDateFormat(pattern.getPattern());
		return fm.format(date);
	}
	
	public static Long parseStringToLong(String dateTime, DatePattern pattern){
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern.getPattern());
		Date date = new Date();
		try {
			date = dateFormat.parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date.getTime()/1000;
	}
	
	public static String parseLongToString(Long dateTime, DatePattern pattern){
		
		if(dateTime == null) return "";
		Date date = new Date(dateTime * 1000);
		
		return DateFormatUtils.format(date, pattern.getPattern());
	}
	
	public static void main(String[] arg0){
		
		String str = "123456";
		System.out.println(CodeUtils.hexMD5(str));
		
		System.out.println(System.currentTimeMillis());
		
		System.out.println(DateUtils.parseStringToLong("2017-03-18 14:30:10", DatePattern.yyyy_MM_dd_HH_mm_ss));
	}
}
