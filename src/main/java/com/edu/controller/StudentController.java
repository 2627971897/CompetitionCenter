package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.CompetitionCustom;
import com.edu.po.EntryCustom;
import com.edu.po.StudentCustom;
import com.edu.potemp.LoginTemp;
import com.edu.potemp.MyError;
import com.edu.service.CompetitionService;
import com.edu.service.EntryService;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CompetitionService competitionService;

    @Autowired
    private EntryService entryService;

    @RequestMapping("/sLogin")
    public String sLogin(LoginTemp loginTemp, HttpServletRequest request, HttpSession session){
        StudentCustom studentCustom = studentService.getStudentCByIdPwd(loginTemp);
        if (studentCustom == null){
            System.out.println("学生登录失败，用户名或密码错误！");
            MyError myError = new MyError();
            myError.setErrorInfo("学生登录失败，用户名或密码错误！");
            request.setAttribute("myError",myError);
            return "myError";
        }
        else{
            System.out.println("登陆成功-身份：学生" + JSON.toJSONString(studentCustom));
            session.setAttribute("student",studentCustom);
            return "student/studentIndex";
        }
    }

    // 查看所有报名中的比赛
    @RequestMapping("/toJoiningComp")
    public String toJoiningComp(HttpServletRequest request){
        List<CompetitionCustom> competitionCustomList = competitionService.getCompByStatus("3");
        request.setAttribute("competitionList",competitionCustomList);
        return "/student/joiningComp";
    }

    // 去参加比赛Step1
    @RequestMapping("/toJoinCompStep1")
    public String toJoinCompStep1(Integer compId,HttpServletRequest request){

        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "/student/joinCompStep1";
    }

    // 去参加比赛Step2,填写比赛扩展信息
    @RequestMapping("/toJoinCompStep2")
    public String toJoinCompStep2(EntryCustom entryCustom){
        entryService.addEntry(entryCustom);
        return "/student/joinCompStep2";
    }

    // 去参加比赛Step3,填写比赛成员信息
    @RequestMapping("/toJoinCompStep3")
    public String toJoinCompStep3(){


        return "/student/joinCompStep2";
    }
}
