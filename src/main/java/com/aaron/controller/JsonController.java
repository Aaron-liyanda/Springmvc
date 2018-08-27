package com.aaron.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaron.entity.User;

/**
 * 
 * ���� ��������json �Ĳ���
 * @author�� Aaron
 * @date�� 2018��8��24��
 */

@Controller
@RequestMapping("json")
public class JsonController {
	
	@ResponseBody
	@RequestMapping("/test1")
	public User hello(){
		User user = new User();
		user.setName("�ܲ�");
		user.setPassword("88888");
		
		return user;
	}
	
	@ResponseBody
	@RequestMapping("/test2")
	public Map hello2(){
		
		Map map = new HashMap();
		User user = new User();
		user.setName("�ܲ�");
		user.setPassword("88888");
		
		map.put("user", user);
		map.put("quote", "stay hungry, stay foolish!");
		return map;		
	}

}
