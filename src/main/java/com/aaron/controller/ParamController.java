package com.aaron.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaron.entity.Cart;
import com.aaron.entity.User;
import com.aaron.service.ParamService;

/**
 * 测试参数的传递
 * 需求： 
 * @author： Aaron
 * @date： 2018年8月24日
 */

@Controller
@RequestMapping("/param")
public class ParamController {
	
	Logger log = Logger.getLogger(ParamController.class);
	
	@Autowired
	private ParamService paramService;

	public ParamService getParamService() {
		return paramService;
	}

	public void setParamService(ParamService paramService) {
		this.paramService = paramService;
	}
	
	@RequestMapping("/test1")  
	public String test1(String name, @RequestParam("password")String password){
//		上列参数中。一个加了参数注解，一个未加参数注解
//		如果未加参数注解 则必须保证 参数名的一致，加了注解则可以不同
		log.info(name + "---" + password);
		paramService.addUser();
		return "success";
	}
	
//	参数为对象   传入的对象 属性名必须相同
	@RequestMapping("/test3")  
	public String test3(User user){
		log.info(user.getName() + "-===-" + user.getPassword());
		paramService.addUser();
		return "success";
	}
	
//	路径变量   在url路径里带参数   最后一个/后带什么，什么就会传过去
	@RequestMapping("/test4/{hero}")  
	public String test4(@PathVariable("hero")String name){
		log.info(name);
		paramService.addUser();
		return "success";
	}
	//多个参数
	@RequestMapping("/test5/{hero1}/{hero2}")
	public String test5(@PathVariable("hero1")String name1, @PathVariable("hero2")String name2){
		log.info(name1 + "---"+ name2);
		paramService.addUser();
		return "success";
	}
	
//	
	@RequestMapping("/test6")
	public String test6(Cart cart){
		log.info(cart);
		paramService.addUser();
		return "success";   
//		return "/jsp/success.jsp";
		//return 可以设置地址   /jsp/success.jsp  (去掉视图解析器 )！！！！！！！！
	}

}
