package net.kzm.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {

	@RequestMapping (value ={"/","/home","/index"})
	public ModelAndView index(){
		System.out.println("page");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		System.out.println(mv);
		return mv;
		
	}
	@RequestMapping (value ={"/about"})
	public ModelAndView about(){
	
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("userClickAbout",true);
		
		return mv;
		
	}
	@RequestMapping (value ={"/contact"})
	public ModelAndView contact(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		
		return mv;
		
	}
//	@RequestMapping (value="/test")
//	public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting_ ){
//		if(greeting_==null){
//			greeting_="Hello there";
//		}
//		
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("msg",greeting_);
//		System.out.println(mv);
//		return mv;
//	}
	
/*	@RequestMapping (value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting_ ){
		if(greeting_==null){
			greeting_="Hello there";
		}
		
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg",greeting_);
		System.out.println(mv);
		return mv;
	}*/
	
	
	
	
}
