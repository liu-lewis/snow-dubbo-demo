package com.snow.consumer.controller;

import com.snow.provider.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {
	
	@Autowired
	private DemoService demoService;

	@RequestMapping("/testSay")
	@ResponseBody
	public String sayHello(String name){
		String str = demoService.sayHello(name);
		return str;
	}
}
