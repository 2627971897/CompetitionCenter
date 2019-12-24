package com.edu.service.impl;

import com.edu.mapper.TeacherMapper;
import com.edu.po.Teacher;
import com.edu.po.TeacherCustom;
import com.edu.po.TeacherExample;
import com.edu.potemp.LoginTemp;
import com.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public TeacherCustom getTeacherCByIdPwd(LoginTemp loginTemp) {
        // teacherCustom作为返回结果
        TeacherCustom teacherCustom = new TeacherCustom();
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacherIdEqualTo(loginTemp.getLoginId());
        criteria.andTeacherPwdEqualTo(loginTemp.getLoginPwd());
        List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
        if (teacherList.size() <= 0){
            System.out.println("TeacherServiceImpl:用户名或密码输入错误");
            return null;
        }
        System.out.println("TeacherServiceImpl:登陆成功");
        teacherCustom.setTeacherId(teacherList.get(0).getTeacherId());
        teacherCustom.setTeacherName(teacherList.get(0).getTeacherName());
        teacherCustom.setTeacherDept(teacherList.get(0).getTeacherDept());
        teacherCustom.setTeacherTitle(teacherList.get(0).getTeacherTitle());
        teacherCustom.setTeacherPost(teacherList.get(0).getTeacherPost());
        teacherCustom.setTeacherPwd(teacherList.get(0).getTeacherPwd());
        return teacherCustom;
    }
}
