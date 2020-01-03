package com.edu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


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

        if ("teacher".equals(chooseTerrace)){   // 教师登录
            return "forward:tLogin";
        }
        else if ("student".equals(chooseTerrace)){  // 学生登录
            return "forward:sLogin";
        }
        else if ("school".equals(chooseTerrace)){   // 学校登录
            return "forward:bLogin";
        }
        return "login";
    }

}
