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
		SeoUtil.setSeo(map, "С����_2014�������籭��������", "���籭���̱�,���籭���ְ�,���籭����,���籭,�������籭����,�������籭", "2014�������籭����ϵͳ�ṩ�������籭���̣��������籭ֱ�����������籭���ţ��������籭ͼƬ���������籭��Ƶ����ر�����");
		model.addAllAttributes(map);
		return "schedule/group";
	}
	
	@RequestMapping("/playoffs")
	public String toPlayOffs(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "С����_2014�������籭��������", "���籭���̱�,���籭���ְ�,���籭����,���籭,�������籭����,�������籭", "2014�������籭����ϵͳ�ṩ�������籭���̣��������籭ֱ�����������籭���ţ��������籭ͼƬ���������籭��Ƶ����ر�����");
		model.addAllAttributes(map);
		return "schedule/group";
	}
	
	@RequestMapping("/calendar")
	public String toCalendar(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "С����_2014�������籭��������", "���籭���̱�,���籭���ְ�,���籭����,���籭,�������籭����,�������籭", "2014�������籭����ϵͳ�ṩ�������籭���̣��������籭ֱ�����������籭���ţ��������籭ͼƬ���������籭��Ƶ����ر�����");
		model.addAllAttributes(map);
		return "schedule/group";
	}
	
	@RequestMapping("/richteam")
	public String toRichTeam(Model model, HttpServletRequest request){
		Map<String, Object> map = new HashMap<String, Object>();
		SeoUtil.setSeo(map, "С����_2014�������籭��������", "���籭���̱�,���籭���ְ�,���籭����,���籭,�������籭����,�������籭", "2014�������籭����ϵͳ�ṩ�������籭���̣��������籭ֱ�����������籭���ţ��������籭ͼƬ���������籭��Ƶ����ر�����");
		model.addAllAttributes(map);
		return "schedule/group";
	}
}
