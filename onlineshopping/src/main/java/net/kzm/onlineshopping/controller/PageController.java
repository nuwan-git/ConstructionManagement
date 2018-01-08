package net.kzm.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;


@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping (value ={"/","/home","/index"})
	public ModelAndView index(){
		System.out.println("page");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		//passing the of categories
		mv.addObject("categories",categoryDAO.list());
		
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
	/*
	 * Methods to all products and based on category
	 * 
	 */
	
	@RequestMapping (value ="/show/all/products")
	public ModelAndView showAllProducts(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All_Products");
		
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		
		
		return mv;
		
	}
	
	@RequestMapping (value ="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable ("id") int id){
		
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDao to fetch single category
		
		Category category = null;
		 category = categoryDAO.get(id);
		mv.addObject("title",category.getName());
		
		//passing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		//passing the single category object
		mv.addObject("category",categoryDAO.get(id));
		
		mv.addObject("userClickCategoryProducts",true);
		
		
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
