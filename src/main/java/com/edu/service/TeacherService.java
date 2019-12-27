package com.edu.service;

import com.edu.po.Teacher;
import com.edu.po.TeacherCustom;
import com.edu.potemp.LoginTemp;

public interface TeacherService {

    TeacherCustom getTeacherCByTid(String teacherId);

    TeacherCustom getTeacherCByIdPwd(LoginTemp loginTemp);
}
