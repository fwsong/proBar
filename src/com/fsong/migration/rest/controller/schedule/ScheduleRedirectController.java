package com.fsong.migration.rest.controller.schedule;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsong.migration.web.util.SeoUtil;

@Controller
@RequestMapping("/schedule")
public class ScheduleRedirectController {

	@RequestMapping("/group")
	public String toGroup(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "小组赛_2014巴西世界杯数据中心", "世界杯赛程表,世界杯积分榜,世界杯射手,世界杯,巴西世界杯赛程,巴西世界杯", "2014巴西世界杯数据系统提供巴西世界杯赛程，巴西世界杯直播，巴西世界杯新闻，巴西世界杯图片，巴西世界杯视频等相关报道。");
		model.addAllAttributes(map);
		return "schedule/group";
	}
	
	@RequestMapping("/playoffs")
	public String toPlayOffs(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "小组赛_2014巴西世界杯数据中心", "世界杯赛程表,世界杯积分榜,世界杯射手,世界杯,巴西世界杯赛程,巴西世界杯", "2014巴西世界杯数据系统提供巴西世界杯赛程，巴西世界杯直播，巴西世界杯新闻，巴西世界杯图片，巴西世界杯视频等相关报道。");
		model.addAllAttributes(map);
		return "schedule/group";
	}
	
	@RequestMapping("/calendar")
	public String toCalendar(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "小组赛_2014巴西世界杯数据中心", "世界杯赛程表,世界杯积分榜,世界杯射手,世界杯,巴西世界杯赛程,巴西世界杯", "2014巴西世界杯数据系统提供巴西世界杯赛程，巴西世界杯直播，巴西世界杯新闻，巴西世界杯图片，巴西世界杯视频等相关报道。");
		model.addAllAttributes(map);
		return "schedule/group";
	}
	
	@RequestMapping("/richteam")
	public String toRichTeam(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "小组赛_2014巴西世界杯数据中心", "世界杯赛程表,世界杯积分榜,世界杯射手,世界杯,巴西世界杯赛程,巴西世界杯", "2014巴西世界杯数据系统提供巴西世界杯赛程，巴西世界杯直播，巴西世界杯新闻，巴西世界杯图片，巴西世界杯视频等相关报道。");
		model.addAllAttributes(map);
		return "schedule/group";
	}
}
