package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.CompetitionCustom;
import com.edu.po.DeptCustom;
import com.edu.po.EntryCustom;
import com.edu.po.TeacherCustom;
import com.edu.potemp.LoginTemp;
import com.edu.potemp.MyError;
import com.edu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Autowired
    private DeptService deptService;

    @Autowired
    private CompetitionScopeService competitionScopeService;

    @Autowired
    private CompetitionObjService competitionObjService;

    @Autowired
    private CompetitionExtService competitionExtService;

    @Autowired
    private EntryService entryService;

    // 解决前端date类型映射不到实体类的问题
    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    // 教师登录，验证用户名密码是否正确
    @RequestMapping("/tLogin")
    public String tLogin(LoginTemp loginTemp, HttpServletRequest request, HttpSession session){
        TeacherCustom teacherCustom = teacherService.getTeacherCByIdPwd(loginTemp);
        if (teacherCustom == null){
            System.out.println("教师登录失败，用户名或密码错误！");
            MyError myError = new MyError();
            myError.setErrorInfo("教师登录失败，用户名或密码错误！");
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
    public String toReleaseCompByCid(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        List<DeptCustom> deptCustomList = deptService.getDeptAll();
        request.setAttribute("competition",competitionCustom);
        request.setAttribute("deptList",deptCustomList);
        return "teacher/releaseComp";
    }

    // 发布报名信息
    @RequestMapping("/releaseCompByCid")
    public String releaseCompByCid(@RequestParam(value = "grade", required = false) String[] grades,
                                   @RequestParam(value = "myExtend", required = false) String[] myExtends,
                                   Integer compId, Integer deptId,
                                   HttpServletRequest request, HttpSession session){
        if (grades.length >= 5){
            competitionScopeService.addCompScopeByCidVal(compId,"9");
        }
        else {
            for (String grade : grades ) {
                competitionScopeService.addCompScopeByCidVal(compId,grade);
            }
        }
        competitionObjService.addCompObjByCidDid(compId,deptId);
        if (myExtends != null){
            for (String myExtend : myExtends ) {
                competitionExtService.addCompExtByCidExtKey(compId,myExtend);
            }
        }
        competitionService.changeStaCompByCid(compId,"3");
        return "forward:toMyCompetition";
    }

    // 去录入成绩
    @RequestMapping("/toScoreCompByCid")
    public String scoreCompByCid(CompetitionCustom competitionCustom){
        return "teacher/scoreComp";
    }

    // 查看比赛详细信息
    @RequestMapping("/toTCompetitionInfo")
    public String toTCompetitionInfo(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "/teacher/competitionInfo";
    }

    @RequestMapping("/chooseEntry")
    public String chooseEntry(String chooseTerrace,Integer compId,HttpSession session){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        session.setAttribute("competitionForEntry",competitionCustom);
        if ("apply".equals(chooseTerrace)){   // 教师登录
            return "forward:toApplyEntry";
        }
        else if ("failure".equals(chooseTerrace)){  // 学生登录
            return "forward:toFailureEntry";
        }
        else if ("suc".equals(chooseTerrace)){   // 学校登录
            return "forward:toSucEntry";
        }
        else if ("all".equals(chooseTerrace)){
            return "forward:toAllEntry";
        }
        return "login";
    }

    // 查看申请比赛的信息
    @RequestMapping("/toApplyEntry")
    public String toApplyEntry(HttpSession session,HttpServletRequest request){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("competitionForEntry");
        List<EntryCustom> entryCustomList = entryService.getEntryByCidSta(competitionCustom.getCompId(),"11");
        request.setAttribute("entryList",entryCustomList);
        return "teacher/applyEntry";
    }

    // 查看申请失败的信息
    @RequestMapping("/toFailureEntry")
    public String toFailureEntry(HttpSession session,HttpServletRequest request){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("competitionForEntry");
        List<EntryCustom> entryCustomList = entryService.getEntryByCidSta(competitionCustom.getCompId(),"911");
        request.setAttribute("entryList",entryCustomList);
        return "teacher/failureEntry";
    }

    // 查看审核通过的信息
    @RequestMapping("/toSucEntry")
    public String toSucEntry(HttpSession session,HttpServletRequest request){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("competitionForEntry");
        List<EntryCustom> entryCustomList = entryService.getEntryByCidSta(competitionCustom.getCompId(),"12","13");
        request.setAttribute("entryList",entryCustomList);
        return "teacher/sucEntry";
    }

    // 查看全部参赛的信息
    @RequestMapping("/toAllEntry")
    public String toAllEntry(HttpSession session,HttpServletRequest request){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("competitionForEntry");
        List<EntryCustom> entryCustomList = entryService.getEntryByCidSta(competitionCustom.getCompId());
        request.setAttribute("entryList",entryCustomList);
        return "teacher/allEntry";
    }

    @RequestMapping("/toEntryInfo")
    public String toEntryInfo(Integer entryId,HttpServletRequest request){
        EntryCustom entryCustom = entryService.getEntryOneByEid(entryId);
        request.setAttribute("entry",entryCustom);
        return "teacher/entryInfo";
    }

    @RequestMapping("/auditPassEntryOne")
    public String auditPassEntryOne(Integer entryId){
        EntryCustom entryCustom = entryService.getEntryOneByEid(entryId);
        if ("N".equals(entryCustom.getIsPro())){
            entryService.changeStaEntryByEid(entryId,"12");
        }
        else {
            entryService.changeStaEntryByEid(entryId,"13");
        }
        return "redirect:toApplyEntry";
    }

    @RequestMapping("/auditNoPassEntryOne")
    public String auditNoPassEntryOne(Integer entryId){
        entryService.changeStaEntryByEid(entryId,"911");
        return "redirect:toApplyEntry";
    }
}
