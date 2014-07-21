package com.fsong.migration.rest.controller.index;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsong.migration.web.util.SeoUtil;

@Controller
@RequestMapping("/index")
public class IndexRedirectController {
	
	@RequestMapping()
	public String toIndex(Model model, HttpServletRequest request){
		Map<String,Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "世界杯数据统计", "世界杯，论坛，world cup", "世界杯前沿资讯");
		model.addAllAttributes(map);
		return "index/index";
	}

}
