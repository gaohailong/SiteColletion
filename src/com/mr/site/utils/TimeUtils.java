package com.mr.site.utils;

/**
 * @author gaohailong @version1.0
 */
public class TimeUtils {
	/**
	 * 获取linux时间戳
	 * 
	 * @return
	 */
	public static long getLinuxTime() {
		long time = System.currentTimeMillis();
		return time;
	}
}
