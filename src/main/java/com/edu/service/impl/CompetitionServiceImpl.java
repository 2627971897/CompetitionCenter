package com.edu.service.impl;

import com.edu.mapper.CompetitionMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.po.*;
import com.edu.service.*;
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

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private CompetitionExtService competitionExtService;

    @Autowired
    private CompetitionObjService competitionObjService;

    @Autowired
    private CompetitionScopeService competitionScopeService;

    // 将Competition类型转换成CompetitionCustom类型
    public CompetitionCustom transformToCompetitionCustom(Competition competition) {

        CompetitionCustom competitionCustom = new CompetitionCustom();
        if (competition != null){
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

            competitionCustom.setTeacherName(teacherService.getTeacherCByTid(competition.getTeacherId()).getTeacherName());

            competitionCustom.setCompetitionExtCustomList(competitionExtService.getCompExtByCid(competition.getCompId()));

            competitionCustom.setCompetitionScopeCustomList(competitionScopeService.getCompScopeByCid(competition.getCompId()));

            competitionCustom.setCompetitionObjCustomList(competitionObjService.getCompObjByCid(competition.getCompId()));
        }

        return competitionCustom;
    }

    // 将Competition类型的list，转换成CompetitionCustom类型的list
    public List<CompetitionCustom> transformToCompetitionCustomList(List<Competition> competitionList) {
        List<CompetitionCustom> competitionCustomList = new ArrayList<>();
        for (Competition competition : competitionList) {
            competitionCustomList.add(transformToCompetitionCustom(competition));
        }
        return competitionCustomList;
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
        criteria.andIsDelEqualTo("N");
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustomList(competitionList);
        return competitionCustomList;
    }

    // 获得所有比赛
    @Override
    public List<CompetitionCustom> getCompAll() {
        CompetitionExample competitionExample = new CompetitionExample();
        CompetitionExample.Criteria criteria = competitionExample.createCriteria();
        criteria.andIsDelEqualTo("N");
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustomList(competitionList);
        return competitionCustomList;
    }

    // 获得所有某个状态的比赛
    @Override
    public List<CompetitionCustom> getCompByStatus(String compStatus) {
        CompetitionExample competitionExample = new CompetitionExample();
        CompetitionExample.Criteria criteria = competitionExample.createCriteria();
        criteria.andCompStatusEqualTo(compStatus);
        criteria.andIsDelEqualTo("N");
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustomList(competitionList);
        return competitionCustomList;
    }

    // 根据CompId查询比赛
    @Override
    public CompetitionCustom getCompByCid(Integer compId) {
        Competition competition = competitionMapper.selectByPrimaryKey(compId);
        CompetitionCustom competitionCustom = transformToCompetitionCustom(competition);
        return competitionCustom;
    }

    // 更改比赛状态
    @Override
    public void changeStaCompByCid(Integer compId, String compStatus) {
        Competition competition = new Competition();
        competition.setCompId(compId);
        competition.setCompStatus(compStatus);
        competitionMapper.updateByPrimaryKeySelective(competition);
    }
}
