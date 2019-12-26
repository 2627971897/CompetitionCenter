package com.edu.service.impl;

import com.edu.mapper.CompetitionMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.po.Competition;
import com.edu.po.CompetitionCustom;
import com.edu.po.CompetitionExample;
import com.edu.po.Teacher;
import com.edu.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionMapper competitionMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    // 将Competition类型的list，转换成CompetitionCustom类型的list
    public List<CompetitionCustom> transformToCompetitionCustomList(List<Competition> competitionList) {
        List<CompetitionCustom> competitionCustomList = new ArrayList<>();

        for (Competition competition : competitionList) {
            CompetitionCustom competitionCustom = new CompetitionCustom();
            competitionCustom.setCompId(competition.getCompId());
            competitionCustom.setTeacherId(competition.getTeacherId());
            competitionCustom.setCompName(competition.getCompName());
            competitionCustom.setCompDesc(competition.getCompDesc());
            competitionCustom.setIsPro(competition.getIsPro());
            competitionCustom.setApplyTime(competition.getApplyTime());
            competitionCustom.setBeginTime(competition.getBeginTime());
            competitionCustom.setEndTime(competition.getEndTime());
            competitionCustom.setCompStatus(competition.getCompStatus());
            competitionCustom.setIsDel(competition.getIsDel());
            competitionCustom.setIsPer(competition.getIsPer());
            competitionCustomList.add(competitionCustom);
        }
        return competitionCustomList;
    }

    // 将Competition类型转换成CompetitionCustom类型
    public CompetitionCustom transformToCompetitionCustom(Competition competition) {

        CompetitionCustom competitionCustom = new CompetitionCustom();
        competitionCustom.setCompId(competition.getCompId());
        competitionCustom.setTeacherId(competition.getTeacherId());
        competitionCustom.setCompName(competition.getCompName());
        competitionCustom.setCompDesc(competition.getCompDesc());
        competitionCustom.setIsPro(competition.getIsPro());
        competitionCustom.setApplyTime(competition.getApplyTime());
        competitionCustom.setBeginTime(competition.getBeginTime());
        competitionCustom.setEndTime(competition.getEndTime());
        competitionCustom.setCompStatus(competition.getCompStatus());
        competitionCustom.setIsDel(competition.getIsDel());
        competitionCustom.setIsPer(competition.getIsPer());
        return competitionCustom;
    }

    // 申请比赛
    @Override
    public void addCompetition(CompetitionCustom competitionCustom) {
        competitionCustom.setApplyTime(new Date());
        competitionCustom.setCompStatus("1");
        competitionMapper.insertSelective(competitionCustom);
    }

    // 根据teacherId查询比赛
    @Override
    public List<CompetitionCustom> getCompByTid(String teacherId) {
        CompetitionExample competitionExample = new CompetitionExample();
        CompetitionExample.Criteria criteria = competitionExample.createCriteria();
        criteria.andTeacherIdEqualTo(teacherId);
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustomList(competitionList);
        for (CompetitionCustom competitionCustom : competitionCustomList) {
            Teacher teacher = teacherMapper.selectByPrimaryKey(competitionCustom.getTeacherId());
            competitionCustom.setTeacherName(teacher.getTeacherName());
        }
        return competitionCustomList;
    }

    // 获得所有比赛
    @Override
    public List<CompetitionCustom> getCompAll() {
        CompetitionExample competitionExample = new CompetitionExample();
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustomList(competitionList);
        for (CompetitionCustom competitionCustom : competitionCustomList) {
            Teacher teacher = teacherMapper.selectByPrimaryKey(competitionCustom.getTeacherId());
            competitionCustom.setTeacherName(teacher.getTeacherName());
        }
        return competitionCustomList;
    }

    // 获得所有某个状态的比赛
    @Override
    public List<CompetitionCustom> getCompByStatus(String compStatus) {
        CompetitionExample competitionExample = new CompetitionExample();
        CompetitionExample.Criteria criteria = competitionExample.createCriteria();
        criteria.andCompStatusEqualTo(compStatus);
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustomList(competitionList);
        for (CompetitionCustom competitionCustom : competitionCustomList) {
            Teacher teacher = teacherMapper.selectByPrimaryKey(competitionCustom.getTeacherId());
            competitionCustom.setTeacherName(teacher.getTeacherName());
        }
        return competitionCustomList;
    }

    // 根据CompId审核通过比赛
    @Override
    public void auditPassCompByCid(Integer compId) {
        Competition competition = new Competition();
        competition.setCompId(compId);
        competition.setCompStatus("2");
        competitionMapper.updateByPrimaryKeySelective(competition);
    }

    // 根据CompId查询比赛
    @Override
    public CompetitionCustom getCompByCid(Integer compId) {
        Competition competition = competitionMapper.selectByPrimaryKey(compId);
        CompetitionCustom competitionCustom = transformToCompetitionCustom(competition);
        Teacher teacher = teacherMapper.selectByPrimaryKey(competitionCustom.getTeacherId());
        competitionCustom.setTeacherName(teacher.getTeacherName());
        return competitionCustom;
    }

    // 根据CompId审核不通过比赛
    @Override
    public void auditNoPassCompByCid(Integer compId) {
        Competition competition = new Competition();
        competition.setCompId(compId);
        competition.setCompStatus("9");
        competitionMapper.updateByPrimaryKeySelective(competition);
    }


}
