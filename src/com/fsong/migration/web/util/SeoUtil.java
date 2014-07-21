package com.fsong.migration.web.util;

import java.util.Map;

public class SeoUtil {

	public static void setSeo(Map<String, Object> map, String title, String keywords, String description){
		map.put("title", title);
		map.put("keywords", keywords);
		map.put("description", description);
	}
}
