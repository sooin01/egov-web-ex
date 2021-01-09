package com.my.app.main.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.app.main.service.MainService;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;

	@PostConstruct
	public void init() {
		int mb = 1024 * 1024;

		System.out.println("Total memory : " + Runtime.getRuntime().totalMemory() / mb + " MB");
		System.out.println("Max memory : " + Runtime.getRuntime().maxMemory() / mb + " MB");
		System.out.println("Free memory : " + Runtime.getRuntime().freeMemory() / mb + " MB");
		System.out.println("Used memory : "
				+ (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / mb + " MB");
	}

	@RequestMapping(value = "/main/index")
	public ModelAndView index(ModelAndView mav) {

		mainService.getMain();

		mav.setViewName("main/index");
		return mav;
	}

}
