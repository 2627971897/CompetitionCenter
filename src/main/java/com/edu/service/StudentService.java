package com.edu.service;

import com.edu.po.StudentCustom;
import com.edu.po.StudentQueryVo;

public interface StudentService {

    StudentCustom getStudentCById(StudentQueryVo studentQueryVo);
}
