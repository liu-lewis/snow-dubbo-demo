package com.snow.consumer.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.snow.provider.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsumerController {
	
	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/testSay/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(@PathVariable("name") String name){
		String str = null;

		if (StringUtils.isNotEmpty(name)) {
			 str = demoService.sayHello(name);
		} else {
			str = demoService.sayHello("国际惯例");
		}
		return str;
	}
}
