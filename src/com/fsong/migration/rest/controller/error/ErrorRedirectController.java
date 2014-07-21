package com.fsong.migration.rest.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsong.migration.web.util.CommonConst;

@Controller
@RequestMapping("/error")
public class ErrorRedirectController {
	
	@RequestMapping("/500")
	public String error500(Model model){
		return CommonConst.faultLinkPage;
	}
	
	@RequestMapping("/404")
	public String error404(Model model){
		return CommonConst.faultLinkPage;
	}
}
