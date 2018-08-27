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
 * ���Բ����Ĵ���
 * ���� 
 * @author�� Aaron
 * @date�� 2018��8��24��
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
//		���в����С�һ�����˲���ע�⣬һ��δ�Ӳ���ע��
//		���δ�Ӳ���ע�� ����뱣֤ ��������һ�£�����ע������Բ�ͬ
		log.info(name + "---" + password);
		paramService.addUser();
		return "success";
	}
	
//	����Ϊ����   ����Ķ��� ������������ͬ
	@RequestMapping("/test3")  
	public String test3(User user){
		log.info(user.getName() + "-===-" + user.getPassword());
		paramService.addUser();
		return "success";
	}
	
//	·������   ��url·���������   ���һ��/���ʲô��ʲô�ͻᴫ��ȥ
	@RequestMapping("/test4/{hero}")  
	public String test4(@PathVariable("hero")String name){
		log.info(name);
		paramService.addUser();
		return "success";
	}
	//�������
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
		//return �������õ�ַ   /jsp/success.jsp  (ȥ����ͼ������ )����������������
	}

}
