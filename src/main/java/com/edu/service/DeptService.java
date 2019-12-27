package com.edu.service;

import com.edu.po.DeptCustom;

import java.util.List;

public interface DeptService {
    List<DeptCustom> getDeptAll();

    DeptCustom getDeptByDid(Integer deptId);
}
