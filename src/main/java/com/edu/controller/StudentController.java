package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.StudentCustom;
import com.edu.po.StudentQueryVo;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/sLogin")
    @ResponseBody
    public String sLogin(StudentQueryVo studentQueryVo, HttpSession session){
        String result = "";
        StudentCustom studentCustom = studentService.getStudentCById(studentQueryVo);
        if (studentCustom == null){
            result = "登录失败，用户名或密码错误！";
        }
        else{
            result = "登陆成功：" + JSON.toJSONString(studentCustom);
        }
        return result;
    }
}
