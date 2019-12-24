package com.edu.controller;

import com.edu.po.StudentQueryVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String toDefault(){
        return "default";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/chooseLogin")
    public String chooseLogin(String chooseTerrace){
        if ("teacher".equals(chooseTerrace)){
            return "forward:tLogin";
        }
        else if ("student".equals(chooseTerrace)){
            return "forward:sLogin";
        }
        return "login";
    }

}
