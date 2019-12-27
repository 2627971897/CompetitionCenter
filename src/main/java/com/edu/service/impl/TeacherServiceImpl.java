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

    public TeacherCustom transformToTeacherCustom(Teacher teacher) {

        TeacherCustom teacherCustom = new TeacherCustom();
        teacherCustom.setTeacherId(teacher.getTeacherId());
        teacherCustom.setTeacherName(teacher.getTeacherName());
        teacherCustom.setTeacherDept(teacher.getTeacherDept());
        teacherCustom.setTeacherTitle(teacher.getTeacherTitle());
        teacherCustom.setTeacherPost(teacher.getTeacherPost());
        teacherCustom.setTeacherPwd(teacher.getTeacherPwd());

        return teacherCustom;
    }

    @Override
    public TeacherCustom getTeacherCByTid(String teacherId) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(teacherId);
        return transformToTeacherCustom(teacher);
    }

    @Override
    public TeacherCustom getTeacherCByIdPwd(LoginTemp loginTemp) {
        // teacherCustom作为返回结果
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeacherIdEqualTo(loginTemp.getLoginId());
        criteria.andTeacherPwdEqualTo(loginTemp.getLoginPwd());
        List<Teacher> teacherList = teacherMapper.selectByExample(teacherExample);
        if (teacherList.size() <= 0){
            return null;
        }
        return transformToTeacherCustom(teacherList.get(0));
    }
}
