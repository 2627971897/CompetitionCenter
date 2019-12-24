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

import java.text.SimpleDateFormat;
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

    public List<CompetitionCustom> transformToCompetitionCustom(List<Competition> competitionList) {
        List<CompetitionCustom> competitionCustomList = new ArrayList<>();

        for (int i=0; i<competitionList.size(); i++){
            CompetitionCustom competitionCustom = new CompetitionCustom();
            competitionCustom.setCompId(competitionList.get(i).getCompId());
            competitionCustom.setTeacherId(competitionList.get(i).getTeacherId());
            competitionCustom.setCompName(competitionList.get(i).getCompName());
            competitionCustom.setCompDesc(competitionList.get(i).getCompDesc());
            competitionCustom.setIsPro(competitionList.get(i).getIsPro());
            competitionCustom.setApplyTime(competitionList.get(i).getApplyTime());
            competitionCustom.setBeginTime(competitionList.get(i).getBeginTime());
            competitionCustom.setEndTime(competitionList.get(i).getEndTime());
            competitionCustom.setCompStatus(competitionList.get(i).getCompStatus());
            competitionCustom.setIsDel(competitionList.get(i).getIsDel());
            competitionCustomList.add(competitionCustom);
        }
        return competitionCustomList;
    }

    @Override
    public void addCompetition(CompetitionCustom competitionCustom) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        competitionCustom.setApplyTime(new Date());
        competitionCustom.setCompStatus("1");
        competitionMapper.insertSelective(competitionCustom);
    }

    @Override
    public List<CompetitionCustom> getCompByTid(String teacherId) {
        CompetitionExample competitionExample = new CompetitionExample();
        CompetitionExample.Criteria criteria = competitionExample.createCriteria();
        criteria.andTeacherIdEqualTo(teacherId);
        List<Competition> competitionList = competitionMapper.selectByExample(competitionExample);
        List<CompetitionCustom> competitionCustomList = transformToCompetitionCustom(competitionList);
        for (CompetitionCustom competitionCustom : competitionCustomList){
            Teacher teacher = teacherMapper.selectByPrimaryKey(competitionCustom.getTeacherId());
            competitionCustom.setTeacherName(teacher.getTeacherName());
        }
        return competitionCustomList;
    }
}
