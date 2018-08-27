package com.aaron.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/aaron")
public class HelloController {
	
	private static Logger log = Logger.getLogger(HelloController.class);
	
	@RequestMapping("/login")
	public ModelAndView hello(){
		
		log.info("action.....");
		
		ModelAndView mv = new ModelAndView();
		String sz[] = {"Jack", "Aaron", "Tony"};
		mv.addObject("lol", sz);
		mv.addObject("info", "it is mt treat");
		
		mv.setViewName("success");  //视图
		return mv;
	}
	
	@RequestMapping("/show")
	public String world(HttpSession session, HttpServletRequest req){
		session.setAttribute("stxt", "我是session");
		req.setAttribute("rtxt", "我是request");
		return "success";
	}
	
	@RequestMapping("/model")
	public String addModel(HttpSession session, Model model){
		session.setAttribute("stxt", "我是session");
		model.addAttribute("model", "我是model");
		return "success";
	}

}
