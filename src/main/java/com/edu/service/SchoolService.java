package com.edu.service;

import com.edu.po.SchoolCustom;
import com.edu.potemp.LoginTemp;

public interface SchoolService {
    SchoolCustom getSchoolCByIdPwd(LoginTemp loginTemp);
}
