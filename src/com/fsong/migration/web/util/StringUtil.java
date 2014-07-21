package com.fsong.migration.web.util;

public class StringUtil {

	public static boolean isNull(String str) {
		return (str == null || str.trim().length() == 0);
	}

}
