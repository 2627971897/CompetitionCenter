package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.CompetitionCustom;
import com.edu.po.TeacherCustom;
import com.edu.potemp.LoginTemp;
import com.edu.potemp.MyError;
import com.edu.service.CompetitionService;
import com.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private CompetitionService competitionService;

    // 解决前端date类型映射不到实体类的问题
    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    // 验证用户名密码是否正确
    @RequestMapping("/tLogin")
    public String tLogin(LoginTemp loginTemp, HttpServletRequest request, HttpSession session){
        TeacherCustom teacherCustom = teacherService.getTeacherCByIdPwd(loginTemp);
        if (teacherCustom == null){
            System.out.println("登录失败，用户名或密码错误！");
            MyError myError = new MyError();
            myError.setErrorInfo("登录失败，用户名或密码错误！");
            request.setAttribute("myError",myError);
            return "myError";
        }
        else {
            System.out.println("登陆成功-身份：教师" + JSON.toJSONString(teacherCustom));
            session.setAttribute("teacher",teacherCustom);
            return "teacher/teacherIndex";
        }
    }

    // 去我的比赛
    @RequestMapping("/toMyCompetition")
    public String tMyCompetition(HttpSession session,HttpServletRequest request){
        TeacherCustom teacherCustom = (TeacherCustom) session.getAttribute("teacher");
        List<CompetitionCustom> competitionCustomList = competitionService.getCompByTid(teacherCustom.getTeacherId());
        request.setAttribute("competitionList",competitionCustomList);
        System.out.println(JSON.toJSONString(competitionCustomList));
        return "teacher/myCompetiton";
    }
    // 去申请比赛
    @RequestMapping("/toApplyCompetition")
    public String toApplyCompetition(){
        return "teacher/applyCompetition";
    }

    // 申请比赛
    @RequestMapping("/applyCompetition")
    public String applyCompetition(
            CompetitionCustom competitionCustom,HttpServletRequest request,HttpSession session){
        TeacherCustom teacherCustom = (TeacherCustom) session.getAttribute("teacher");
        competitionCustom.setTeacherId(teacherCustom.getTeacherId());
        competitionService.addCompetition(competitionCustom);
        return "teacher/teacherIndex";
    }

    // 去发布报名信息
    @RequestMapping("/toReleaseCompByCid")
    public String releaseCompByCid(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "teacher/releaseComp";
    }
    @RequestMapping("/toScoreCompByCid")
    public String scoreCompByCid(CompetitionCustom competitionCustom){
        return "teacher/scoreComp";
    }

    @RequestMapping("/toTCompetitionInfo")
    public String toTCompetitionInfo(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "teacher/competitionInfo";
    }
}
