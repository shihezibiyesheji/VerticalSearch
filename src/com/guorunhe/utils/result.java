package com.guorunhe.utils;


/**
 *用来存储事务执行结果类
 * @author hanning
 *
 */
public class result {
	
	
	private String flag;
	private String message;
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public result() {
	}
	public result(String flag, String message) {
		this.flag = flag;
		this.message = message;
	}
	@Override
	public String toString() {
		return "result [flag=" + flag + ", message=" + message + "]";
	}
	
}
