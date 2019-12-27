package com.edu.service.impl;

import com.edu.mapper.StudentMapper;
import com.edu.po.*;
import com.edu.potemp.LoginTemp;
import com.edu.service.DeptService;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private DeptService deptService;

    public StudentCustom transformToStudentCustom(Student student){
        StudentCustom studentCustom = new StudentCustom();
        studentCustom.setStudentId(student.getStudentId());
        studentCustom.setStudentName(student.getStudentName());
        studentCustom.setDeptId(student.getDeptId());
        studentCustom.setStudentMajor(student.getStudentMajor());
        studentCustom.setStudentGrade(student.getStudentGrade());
        studentCustom.setStudentClass(student.getStudentClass());
        studentCustom.setStudentPwd(student.getStudentPwd());

        DeptCustom deptCustom = deptService.getDeptByDid(student.getDeptId());
        studentCustom.setDeptName(deptCustom.getDeptName());
        return studentCustom;
    }

    @Override
    public StudentCustom getStudentCByIdPwd(LoginTemp loginTemp) {
        // studentCustom作为返回结果
        StudentCustom studentCustom = new StudentCustom();
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStudentIdEqualTo(loginTemp.getLoginId());
        criteria.andStudentPwdEqualTo(loginTemp.getLoginPwd());
        List<Student> studentList = studentMapper.selectByExample(studentExample);
        if (studentList.size() <= 0){
            return null;
        }
        return transformToStudentCustom(studentList.get(0));
    }
}
