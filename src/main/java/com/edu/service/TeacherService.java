package com.edu.service;

import com.edu.po.TeacherCustom;
import com.edu.potemp.LoginTemp;

public interface TeacherService {
    TeacherCustom getTeacherCByIdPwd(LoginTemp loginTemp);
}
