package com.edu.service.impl;

import com.edu.po.SchoolCustom;
import com.edu.mapper.SchoolMapper;
import com.edu.po.School;
import com.edu.po.SchoolExample;
import com.edu.potemp.LoginTemp;
import com.edu.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    public SchoolCustom transformToSchoolCustom(School school){
        SchoolCustom schoolCustom = new SchoolCustom();
        schoolCustom.setSchoolId(school.getSchoolId());
        schoolCustom.setSchoolAccount(school.getSchoolAccount());
        schoolCustom.setSchoolPwd(school.getSchoolPwd());
        return schoolCustom;
    }

    @Override
    public SchoolCustom getSchoolCByIdPwd(LoginTemp loginTemp) {
        // schoolCustom作为返回结果
        SchoolCustom schoolCustom = new SchoolCustom();
        SchoolExample schoolExample = new SchoolExample();
        SchoolExample.Criteria criteria = schoolExample.createCriteria();
        criteria.andSchoolAccountEqualTo(loginTemp.getLoginId());
        criteria.andSchoolPwdEqualTo(loginTemp.getLoginPwd());
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);
        if (schoolList.size() <= 0){
            return null;
        }
        return transformToSchoolCustom(schoolList.get(0));
    }
}
