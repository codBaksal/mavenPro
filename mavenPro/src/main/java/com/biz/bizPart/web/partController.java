package com.biz.bizPart.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class partController {
	
	@RequestMapping(value = "/main")
	public ModelAndView main(ModelAndView mv) {
		System.out.println("main에 들어옴");
		mv.setViewName("main");
		
		return mv;
	}
	
}
