package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.StudentCustom;
import com.edu.po.StudentQueryVo;
import com.edu.potemp.LoginTemp;
import com.edu.potemp.MyError;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/sLogin")
    public String sLogin(LoginTemp loginTemp, HttpServletRequest request, HttpSession session){
        String result = "";
        StudentCustom studentCustom = studentService.getStudentCByIdPwd(loginTemp);
        if (studentCustom == null){
            System.out.println("登录失败，用户名或密码错误！");
            MyError myError = new MyError();
            myError.setErrorInfo("登录失败，用户名或密码错误！");
            request.setAttribute("myError",myError);
            return "myError";
        }
        else{
            System.out.println("登陆成功-身份：学生" + JSON.toJSONString(studentCustom));
            session.setAttribute("student",studentCustom);
            return "student/studentIndex";
        }
    }
}
