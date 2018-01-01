package net.kzm.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

	@RequestMapping (value ={"/","/home","/index"})
	public ModelAndView index(){
		System.out.println("page");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg","Welcome To WEb Mvc");
		System.out.println(mv);
		return mv;
		
	}
	
	
}
