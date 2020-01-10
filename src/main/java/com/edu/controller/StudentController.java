package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.po.*;
import com.edu.potemp.LoginTemp;
import com.edu.potemp.MyError;
import com.edu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CompetitionService competitionService;

    @Autowired
    private EntryService entryService;

    @Autowired
    private EntryExtService entryExtService;

    @Autowired
    private EntrySlaService entrySlaService;

    @Autowired
    private ProColService proColService;

    // 学生登录
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

    // 去首页
    @RequestMapping("/toStIndex")
    public String toStIndex(){
        return "student/studentIndex";
    }

    // 查看所有报名中的比赛
    @RequestMapping("/toJoiningComp")
    public String toJoiningComp(HttpServletRequest request){
        List<CompetitionCustom> competitionCustomList = competitionService.getCompByStatus("3");
        request.setAttribute("competitionList",competitionCustomList);
        return "/student/joiningComp";
    }

    // 查看比赛详细信息
    @RequestMapping("/toStCompetitionInfo")
    public String toStCompetitionInfo(Integer compId,HttpServletRequest request){
        CompetitionCustom competitionCustom = competitionService.getCompByCid(compId);
        request.setAttribute("competition",competitionCustom);
        return "/student/competitionInfo";
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
    public String toJoinCompStep2(HttpSession session,HttpServletRequest request){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("tempCompetitionCustom");
        EntryCustom entryCustom = (EntryCustom) session.getAttribute("tempEntryCustom");
        request.setAttribute("competition",competitionCustom);
        request.setAttribute("entry",entryCustom);
        return "/student/joinCompStep2";
    }

    // 去参加比赛Step3,填写比赛成员信息
    @RequestMapping("/toJoinCompStep3")
    public String toJoinCompStep3(HttpSession session,HttpServletRequest request){
        CompetitionCustom competitionCustom = (CompetitionCustom) session.getAttribute("tempCompetitionCustom");
        EntryCustom entryCustom = (EntryCustom) session.getAttribute("tempEntryCustom");
        request.setAttribute("competition",competitionCustom);
        request.setAttribute("entry",entryCustom);
        return "/student/joinCompStep3";
    }

    // Step1完成
    @RequestMapping("/step1Finish")
    public String step1Finish(EntryCustom entryCustom, HttpSession session){
        EntryCustom entryCustom1 = entryService.addEntryRetId(entryCustom);
        CompetitionCustom competitionCustom = competitionService.getCompByCid(entryCustom.getCompId());
        session.setAttribute("tempCompetitionCustom",competitionCustom);
        session.setAttribute("tempEntryCustom",entryCustom1);
        if (competitionCustom.getCompetitionExtCustomList().size()>0){
            entryService.changeStaEntryByEid(entryCustom1.getEntryId(),"2");
            return "redirect:toJoinCompStep2";
        }
        else {
            if ("N".equals(entryCustom1.getIsPer())){
                entryService.changeStaEntryByEid(entryCustom1.getEntryId(),"3");
                return "redirect:toJoinCompStep3";
            }
            else {
                entryService.changeStaEntryByEid(entryCustom1.getEntryId(),"11");
                return "redirect:toStMyCompetition";
            }
        }
    }

    // Step2完成
    @RequestMapping("/step2Finish")
    public String step2Finish(EntryExtQueryVo entryExtQueryVo,HttpServletRequest request){
        entryExtService.addEntryExtAll(entryExtQueryVo);
        EntryCustom entryCustom = entryService.getEntryByEid(entryExtQueryVo.getEntryExtCustomList().get(0).getEntryId());
        CompetitionCustom competitionCustom = competitionService.getCompByCid(entryCustom.getCompId());
        request.setAttribute("competition",competitionCustom);
        request.setAttribute("entry",entryCustom);
        if ("N".equals(entryCustom.getIsPer())){
            entryService.changeStaEntryByEid(entryCustom.getEntryId(),"3");
            return "redirect:toJoinCompStep3";
        }
        else {
            entryService.changeStaEntryByEid(entryCustom.getEntryId(),"11");

            return "redirect:toStMyCompetition";
        }
    }

    // Step3完成
    @RequestMapping("/step3Finish")
    public String step3Finish(EntrySlaQueryVo entrySlaQueryVo){
        entrySlaService.addEntrySalAll(entrySlaQueryVo);
        entryService.changeStaEntryByEid(entrySlaQueryVo.getEntrySlaCustomList().get(0).getEntryId(),"11");

        return "redirect:toStMyCompetition";
    }

    // 获取所有报名过的比赛
    @RequestMapping("/toStMyCompetition")
    public String toStMyCompetition(HttpServletRequest request,HttpSession session){
        StudentCustom studentCustom = (StudentCustom) session.getAttribute("student");
        List<EntryCustom> entryCustomList = entryService.getEntryAllBySid(studentCustom.getStudentId());
        request.setAttribute("entryList",entryCustomList);
        return "/student/myCompetition";
    }

    // 查看我的详细报名信息
    @RequestMapping("/toMyCompInfo")
    public String toMyCompInfo(Integer entryId,HttpServletRequest request){
        EntryCustom entryCustom = entryService.getEntryOneByEid(entryId);
        request.setAttribute("entry",entryCustom);
        return "/student/myCompInfo";
    }

    // 去提交作品
    @RequestMapping("/toUpload")
    public String toUpload(Integer entryId,HttpServletRequest request){
        EntryCustom entryCustom = entryService.getEntryOneByEid(entryId);
        request.setAttribute("entry",entryCustom);
        return "student/upload";
    }

    // 提交作品
    @RequestMapping("/upload")
    public String upload(Integer entryId, MultipartFile file){

        // 将文件保存在该目录下
        File saveDir = new File("/neuedu/jianhao/doc");
        //File saveDir = new File("D://mySave1");
        // 如果不存在，创建该目录
        if (!saveDir.exists()){
            saveDir.mkdir();
        }
        String originalName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString().replaceAll("-","") + originalName.substring(originalName.lastIndexOf("."));
        File newFile = new File(saveDir,newName);
        try {
            // 将文件写入到磁盘中
            file.transferTo(newFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        String proLink = "jianhao/doc/" + newName;

        // 写入数据库
        proColService.addProColByEid(entryId,originalName,proLink);

        entryService.changeStaEntryByEid(entryId,"14");
        return "redirect:toStMyCompetition";
    }
}