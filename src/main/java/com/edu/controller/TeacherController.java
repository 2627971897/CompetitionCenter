package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.*;
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
import javax.swing.plaf.PanelUI;
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

    // 去首页
    @RequestMapping("/toTeIndex")
    public String toTeIndex(){
        return "teacher/teacherIndex";
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
            CompetitionCustom competitionCustom,HttpSession session){
        TeacherCustom teacherCustom = (TeacherCustom) session.getAttribute("teacher");
        competitionCustom.setTeacherId(teacherCustom.getTeacherId());
        competitionService.addCompetition(competitionCustom);
        return "redirect:toMyCompetition";
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
                                   Integer compId, Integer deptId){
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

    // 查看比赛详细信息
    @RequestMapping("/toTCompetitionInfo")
    public String toTCompetitionInfo(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "/teacher/competitionInfo";
    }

    // 选择需要查看的状态的参赛信息
    @RequestMapping("/chooseEntry")
    public String chooseEntry(String chooseTerrace,Integer compId,HttpSession session){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        session.setAttribute("competitionForEntry",competitionCustom);
        if ("apply".equals(chooseTerrace)){   // 申请中的
            return "forward:toApplyEntry";
        }
        else if ("failure".equals(chooseTerrace)){  // 已拒绝的
            return "forward:toFailureEntry";
        }
        else if ("suc".equals(chooseTerrace)){   // 成功的
            return "forward:toSucEntry";
        }
        else if ("all".equals(chooseTerrace)){  // 全部的
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
        List<EntryCustom> entryCustomList = entryService.getEntryByCidNotInSta(competitionCustom.getCompId(),"11","911");
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

    // 查看详细参赛信息
    @RequestMapping("/toEntryInfo")
    public String toEntryInfo(Integer entryId,HttpServletRequest request){
        EntryCustom entryCustom = entryService.getEntryOneByEid(entryId);
        request.setAttribute("entry",entryCustom);
        return "teacher/entryInfo";
    }

    // 通过参赛申请
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

    // 不通过参赛申请
    @RequestMapping("/auditNoPassEntryOne")
    public String auditNoPassEntryOne(Integer entryId){
        entryService.changeStaEntryByEid(entryId,"911");
        return "redirect:toApplyEntry";
    }

    // 去给分界面
    @RequestMapping("/toGiveScoreList")
    public String toGiveScoreList(Integer compId,HttpServletRequest request,HttpSession session){
        List<EntryCustom> entryCustomList = entryService.getEntryByCidSta(compId,"12","14");
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        session.setAttribute("competitionForEntry",competitionCustom);
        request.setAttribute("entryList",entryCustomList);
        request.setAttribute("competition",competitionCustom);
        return "teacher/giveScoreList";
    }

    // 去给分
    @RequestMapping("/toGiveScore")
    public String toGiveScore(Integer entryId,HttpServletRequest request){
        EntryCustom entryCustom = entryService.getEntryOneByEid(entryId);
        request.setAttribute("entry",entryCustom);
        return "teacher/giveScore";
    }

    // 给分
    @RequestMapping("/giveScore")
    public String giveScore(Integer entryId,String score,HttpSession session){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("competitionForEntry");
        entryService.giveScoreByEid(entryId,score);
        entryService.changeStaEntryByEid(entryId,"15");
        return "redirect:toGiveScoreList?compId="+competitionCustom.getCompId();
    }

    // 截止报名
    @RequestMapping("/toStopSignByCid")
    public String toStopSignByCid(Integer compId){
        competitionService.changeStaCompByCid(compId,"4");
        entryService.changeStaToStaEntryByCid(compId,"11","911");
        return "redirect:toMyCompetition";
    }

    // 比赛截止
    @RequestMapping("/toStopCompByCid")
    public String toStopCompByCid(Integer compId){
        competitionService.changeStaCompByCid(compId,"5");
        entryService.changeStaToStaEntryByCid(compId,"13","404");
        return "redirect:toMyCompetition";
    }

    // 成绩全部录入完毕
    @RequestMapping("/toGiveScoreEnd")
    public String toGiveScoreEnd(Integer compId){
        competitionService.changeStaCompByCid(compId,"0");
        return "redirect:toMyCompetition";
    }

    // 查看成绩单
    @RequestMapping("/toShowReport")
    public String toShowReport(Integer compId,HttpServletRequest request){
        List<EntryCustom> entryCustomList = entryService.getEntryByCidSta(compId,"15","404");
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        request.setAttribute("entryList",entryCustomList);
        return "teacher/showReport";
    }
}
