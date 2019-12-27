package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.CompetitionCustom;
import com.edu.po.SchoolCustom;
import com.edu.potemp.LoginTemp;
import com.edu.potemp.MyError;
import com.edu.service.CompetitionService;
import com.edu.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SchoolController {

    @Autowired
    private SchoolService schoolService;
    @Autowired
    private CompetitionService competitionService;

    @RequestMapping("/bLogin")
    public String bLogin(LoginTemp loginTemp, HttpServletRequest request, HttpSession session){
        SchoolCustom schoolCustom = schoolService.getSchoolCByIdPwd(loginTemp);
        if (schoolCustom == null){
            System.out.println("学校登录失败，用户名或密码错误！");
            MyError myError = new MyError();
            myError.setErrorInfo("学校登录失败，用户名或密码错误！");
            request.setAttribute("myError",myError);
            return "myError";
        }
        else {
            System.out.println("登陆成功-身份：学校" + JSON.toJSONString(schoolCustom));
            session.setAttribute("school",schoolCustom);
            return "school/schoolIndex";
        }
    }
    @RequestMapping("/toAllCompetition")
    public String toAllCompetition(HttpSession session,HttpServletRequest request){
        SchoolCustom schoolCustom = (SchoolCustom) session.getAttribute("school");
        List<CompetitionCustom> competitionCustomList = competitionService.getCompAll();
        request.setAttribute("competitionList",competitionCustomList);
        System.out.println(JSON.toJSONString(competitionCustomList));
        return "school/allCompetition";
    }
    @RequestMapping("/toVerifyCompetition")
    public String toVerifyCompetition(HttpSession session,HttpServletRequest request){
        List<CompetitionCustom> competitionCustomList = competitionService.getCompByStatus("1");
        request.setAttribute("competitionList",competitionCustomList);
        System.out.println(JSON.toJSONString(competitionCustomList));
        return "school/applyCompetition";
    }

    @RequestMapping("/auditPassCompOne")
    public String auditPassCompOne(CompetitionCustom competitionCustom){
        competitionService.auditPassCompByCid(competitionCustom.getCompId());
        return "forward:toVerifyCompetition";
    }

    @RequestMapping("/auditNoPassCompOne")
    public String auditNoPassCompOne(CompetitionCustom competitionCustom){
        competitionService.auditNoPassCompByCid(competitionCustom.getCompId());
        return "forward:toVerifyCompetition";
    }

    @RequestMapping("/toSCompetitionInfo")
    public String toSCompetitionInfo(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "school/competitionInfo";
    }
}
