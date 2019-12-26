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
            System.out.println("SchoolServiceImpl:用户名或密码输入错误");
            return null;
        }
        System.out.println("SchoolServiceImpl:登陆成功");
        schoolCustom.setSchoolId(schoolList.get(0).getSchoolId());
        schoolCustom.setSchoolAccount(schoolList.get(0).getSchoolAccount());
        schoolCustom.setSchoolPwd(schoolList.get(0).getSchoolPwd());
        return schoolCustom;
    }
}
