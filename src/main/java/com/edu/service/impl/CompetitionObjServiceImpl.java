package com.edu.service.impl;

import com.edu.mapper.CompetitionObjectMapper;
import com.edu.po.CompetitionObjCustom;
import com.edu.po.CompetitionObject;
import com.edu.po.CompetitionObjectExample;
import com.edu.po.DeptCustom;
import com.edu.service.CompetitionObjService;
import com.edu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompetitionObjServiceImpl implements CompetitionObjService {

    @Autowired
    private CompetitionObjectMapper competitionObjectMapper;

    @Autowired
    private DeptService deptService;

    // 将 CompetitionObject 类型转换成 CompetitionObjCustom 类型
    public CompetitionObjCustom transformToCompetitionObjCustom(CompetitionObject competitionObject) {

        CompetitionObjCustom competitionObjCustom = new CompetitionObjCustom();
        if (competitionObject != null){
            competitionObjCustom.setCompId(competitionObject.getCompId());
            competitionObjCustom.setDeptId(competitionObject.getDeptId());
            competitionObjCustom.setCompObjectId(competitionObject.getCompObjectId());
            competitionObjCustom.setIsDel(competitionObject.getIsDel());

            DeptCustom deptCustom = deptService.getDeptByDid(competitionObject.getDeptId());
            competitionObjCustom.setDeptName(deptCustom.getDeptName());
        }
        return competitionObjCustom;
    }

    // 将 CompetitionObject 类型的list，转换成 CompetitionObjCustom 类型的list
    public List<CompetitionObjCustom> transformToCompetitionObjCustomList(List<CompetitionObject> competitionObjectList) {
        List<CompetitionObjCustom> competitionObjCustomList = new ArrayList<>();

        for (CompetitionObject competitionObject : competitionObjectList) {
            competitionObjCustomList.add(transformToCompetitionObjCustom(competitionObject));
        }
        return competitionObjCustomList;
    }

    // 根据 Cid，Did 添加参赛对象
    @Override
    public void addCompObjByCidDid(Integer compId, Integer deptId) {
        CompetitionObject competitionObject = new CompetitionObject();
        competitionObject.setCompId(compId);
        competitionObject.setDeptId(deptId);
        competitionObjectMapper.insertSelective(competitionObject);
    }

    // 根据 Cid 获取参赛对象
    @Override
    public List<CompetitionObjCustom> getCompObjByCid(Integer compId) {
        CompetitionObjectExample competitionObjectExample = new CompetitionObjectExample();
        CompetitionObjectExample.Criteria criteria = competitionObjectExample.createCriteria();
        criteria.andCompIdEqualTo(compId);
        List<CompetitionObject> competitionObjectList = competitionObjectMapper.selectByExample(competitionObjectExample);
        return transformToCompetitionObjCustomList(competitionObjectList);
    }
}
