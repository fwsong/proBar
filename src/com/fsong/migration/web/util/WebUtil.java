package com.fsong.migration.web.util;

import javax.servlet.http.HttpServletRequest;

import com.fsong.migration.web.util.StringUtil;

public class WebUtil {

	public static String getCurrentURL(HttpServletRequest request) {
		String currentURL = null;
		if (request == null)
			return currentURL;
		StringBuilder sb = new StringBuilder();
		sb.append(request.getRequestURL());
		String queryString = request.getQueryString();
		if (!StringUtil.isNull(queryString)) {
			sb.append("?").append(queryString);
		}
		return sb.toString();
	}

}
