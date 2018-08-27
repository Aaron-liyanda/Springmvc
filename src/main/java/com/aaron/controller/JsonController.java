package com.aaron.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaron.entity.User;

/**
 * 
 * 需求： 用来测试json 的测试
 * @author： Aaron
 * @date： 2018年8月24日
 */

@Controller
@RequestMapping("json")
public class JsonController {
	
	@ResponseBody
	@RequestMapping("/test1")
	public User hello(){
		User user = new User();
		user.setName("曹操");
		user.setPassword("88888");
		
		return user;
	}
	
	@ResponseBody
	@RequestMapping("/test2")
	public Map hello2(){
		
		Map map = new HashMap();
		User user = new User();
		user.setName("曹操");
		user.setPassword("88888");
		
		map.put("user", user);
		map.put("quote", "stay hungry, stay foolish!");
		return map;		
	}

}
