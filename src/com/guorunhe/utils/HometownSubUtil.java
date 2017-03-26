package com.guorunhe.utils;

public  class HometownSubUtil {
		
	public	static String province;
	public	static String city;
	public	static String county;
	//获取省份
	public static String getProvince(String hometown) {
		String str=null;
		if(hometown==null||hometown.equals("")){
			str=" ";
		}else{
			str=hometown.substring(0,hometown.indexOf("-"));
		}
		return str;
	}
	//获取城市
	public static String getCity(String hometown) {
		String str=null;
		if(hometown==null||hometown.equals("")){
			str=" ";
		}else{
			str=hometown.substring(hometown.indexOf("-")+1, hometown.lastIndexOf("-"));
		}
		return str;
	}
	//获取县
	public static String getCounty(String hometown) {
		String str=null;
		if(hometown==null||hometown.equals("")){
			str=" ";
		}else{
			str=hometown.substring(hometown.lastIndexOf("-")+1);
		}
		return str;
	}
	
}
