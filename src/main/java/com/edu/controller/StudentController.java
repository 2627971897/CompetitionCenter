package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public String toDefault(){
        return "还没写！";
    }
}
