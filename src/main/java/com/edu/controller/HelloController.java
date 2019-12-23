package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

    @RequestMapping(value = "/toDefault",method = RequestMethod.GET)
    public String toDefault(){
        return "default";
    }

    @RequestMapping(value = "/toIndex",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }
}
