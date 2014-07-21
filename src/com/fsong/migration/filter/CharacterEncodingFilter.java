package com.fsong.migration.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.fsong.migration.filter.CharacterEncodingFilter;
import com.fsong.migration.web.util.WebUtil;

public class CharacterEncodingFilter implements Filter{
	private static String ENCODING = "UTF-8";

	public void init(FilterConfig filterConfig) {
		return;
	}

	public void destroy() {
		return;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		try {
			request.setCharacterEncoding(ENCODING);
			response.setCharacterEncoding(ENCODING);
			String url = WebUtil.getCurrentURL((HttpServletRequest)request);
			request.setAttribute("currentURL", url);
			chain.doFilter(request, response);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
