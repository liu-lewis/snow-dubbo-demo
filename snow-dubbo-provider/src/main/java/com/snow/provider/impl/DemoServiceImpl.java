package com.snow.provider.impl;

import com.snow.provider.service.DemoService;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Leo. on 2018/4/18.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println(name.concat(", Hello World!"));
        return "success";
    }

    public ModelAndView sayHelloWorld() {
        System.out.println("国际惯例, Hello World!");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
