package com.edu.service.impl;

import com.edu.mapper.StudentMapper;
import com.edu.po.Student;
import com.edu.po.StudentCustom;
import com.edu.po.StudentExample;
import com.edu.potemp.LoginTemp;
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
            System.out.println("SutdengServiceImpl:用户名或密码输入错误");
            return null;
        }
        System.out.println("SutdengServiceImpl:登陆成功");
        studentCustom.setStudentId(studentList.get(0).getStudentId());
        studentCustom.setStudentName(studentList.get(0).getStudentName());
        studentCustom.setDeptId(studentList.get(0).getDeptId());
        studentCustom.setStudentMajor(studentList.get(0).getStudentMajor());
        studentCustom.setStudentGrade(studentList.get(0).getStudentGrade());
        studentCustom.setStudentClass(studentList.get(0).getStudentClass());
        studentCustom.setStudentPwd(studentList.get(0).getStudentPwd());
        return studentCustom;
    }
}
