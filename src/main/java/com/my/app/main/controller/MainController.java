package com.my.app.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.app.main.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;

	@RequestMapping(value = "/main/index")
	public ModelAndView index(ModelAndView mav) {
		
		mainService.getMain();
		
		mav.setViewName("main/index");
		return mav;
	}
	
}
