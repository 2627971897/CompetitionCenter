package com.edu.service;

import com.edu.po.CompetitionObjCustom;
import com.edu.po.CompetitionObject;

import java.util.List;

public interface CompetitionObjService {

    void addCompObjByCidDid(Integer compId, Integer deptId);

    List<CompetitionObjCustom> getCompObjByCid(Integer compId);
}
