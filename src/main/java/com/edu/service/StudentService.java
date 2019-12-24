package com.edu.service;

import com.edu.po.StudentCustom;
import com.edu.potemp.LoginTemp;

public interface StudentService {

    StudentCustom getStudentCByIdPwd(LoginTemp loginTemp);
}
