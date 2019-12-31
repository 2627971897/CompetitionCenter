package com.edu.service.impl;

import com.edu.mapper.CompetitionExtendMapper;
import com.edu.po.CompetitionExtCustom;
import com.edu.po.CompetitionExtend;
import com.edu.po.CompetitionExtendExample;
import com.edu.service.CompetitionExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompetitionExtServiceImpl implements CompetitionExtService {
    @Autowired
    private CompetitionExtendMapper competitionExtendMapper;

    // 将 CompetitionExtend 类型转换成 CompetitionExtCustom 类型
    public CompetitionExtCustom transformToCompetitionExtCustom(CompetitionExtend competitionExtend) {

        CompetitionExtCustom competitionExtCustom = new CompetitionExtCustom();
        if (competitionExtend != null){
            competitionExtCustom.setCompId(competitionExtend.getCompId());
            competitionExtCustom.setExtendKey(competitionExtend.getExtendKey());
            competitionExtCustom.setCompExtendId(competitionExtend.getCompExtendId());
            competitionExtCustom.setIsDel(competitionExtend.getIsDel());
        }

        return competitionExtCustom;
    }

    // 将 CompetitionExtend 类型的list，转换成 CompetitionExtCustom 类型的list
    public List<CompetitionExtCustom> transformToCompetitionExtCustomList(List<CompetitionExtend> competitionExtendList) {
        List<CompetitionExtCustom> competitionExtCustomList = new ArrayList<>();

        for (CompetitionExtend competitionExtend : competitionExtendList) {
            competitionExtCustomList.add(transformToCompetitionExtCustom(competitionExtend));
        }
        return competitionExtCustomList;
    }

    // 根据 Cid，String 添加拓展字段
    @Override
    public void addCompExtByCidExtKey(Integer compId, String myExtend) {
        CompetitionExtend competitionExtend = new CompetitionExtend();
        competitionExtend.setCompId(compId);
        competitionExtend.setExtendKey(myExtend);
        competitionExtendMapper.insertSelective(competitionExtend);
    }

    // 根据 Cid 获得扩展信息
    @Override
    public List<CompetitionExtCustom> getCompExtByCid(Integer compId) {
        CompetitionExtendExample competitionExtendExample = new CompetitionExtendExample();
        CompetitionExtendExample.Criteria criteria = competitionExtendExample.createCriteria();
        criteria.andCompIdEqualTo(compId);
        List<CompetitionExtend> competitionExtendList = competitionExtendMapper.selectByExample(competitionExtendExample);
        return transformToCompetitionExtCustomList(competitionExtendList);
    }

    @Override
    public CompetitionExtCustom getCompExtByCEid(Integer compExtendId) {
        return transformToCompetitionExtCustom(competitionExtendMapper.selectByPrimaryKey(compExtendId));
    }
}
