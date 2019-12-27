package com.edu.service.impl;

import com.edu.mapper.CompetitionScopeMapper;
import com.edu.po.CompetitionCustom;
import com.edu.po.CompetitionScope;
import com.edu.po.CompetitionScopeCustom;
import com.edu.po.CompetitionScopeExample;
import com.edu.service.CompetitionScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompetitionScopeServiceImpl implements CompetitionScopeService {

    @Autowired
    private CompetitionScopeMapper competitionScopeMapper;

    // 将 CompetitionScope 类型的list，转换成 CompetitionScopeCustom 类型的list
    public List<CompetitionScopeCustom> transformToCompetitionScopeCustomList(List<CompetitionScope> competitionScopeList) {
        List<CompetitionScopeCustom> competitionScopeCustomList = new ArrayList<>();

        for (CompetitionScope competitionScope : competitionScopeList) {
            CompetitionScopeCustom competitionScopeCustom = new CompetitionScopeCustom();
            competitionScopeCustom.setCompScopeId(competitionScope.getCompScopeId());
            competitionScopeCustom.setCompId(competitionScope.getCompId());
            competitionScopeCustom.setValue(competitionScope.getValue());
            competitionScopeCustom.setIsDel(competitionScope.getIsDel());

            competitionScopeCustomList.add(competitionScopeCustom);
        }

        return competitionScopeCustomList;
    }

    // 将 CompetitionScope 类型转换成 CompetitionScopeCustom 类型
    public CompetitionScopeCustom transformToCompetitionScopeCustom(CompetitionScope competitionScope) {

        CompetitionScopeCustom competitionScopeCustom = new CompetitionScopeCustom();
        competitionScopeCustom.setCompScopeId(competitionScope.getCompScopeId());
        competitionScopeCustom.setCompId(competitionScope.getCompId());
        competitionScopeCustom.setValue(competitionScope.getValue());
        competitionScopeCustom.setIsDel(competitionScope.getIsDel());

        return competitionScopeCustom;
    }

    // 根据 Cid，String 添加参赛范围
    @Override
    public void addCompScopeByCidVal(Integer compId, String grade) {
        CompetitionScope competitionScope = new CompetitionScope();
        competitionScope.setCompId(compId);
        competitionScope.setValue(grade);
        competitionScopeMapper.insertSelective(competitionScope);
    }

    // 根据 Cid 查询参赛范围
    @Override
    public List<CompetitionScopeCustom> getCompScopeByCid(Integer compId) {
        CompetitionScopeExample competitionScopeExample = new CompetitionScopeExample();
        CompetitionScopeExample.Criteria criteria = competitionScopeExample.createCriteria();
        criteria.andCompIdEqualTo(compId);
        List<CompetitionScope> competitionScopeList = competitionScopeMapper.selectByExample(competitionScopeExample);
        return transformToCompetitionScopeCustomList(competitionScopeList);
    }
}
