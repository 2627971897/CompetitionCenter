package com.edu.service;

import com.edu.po.CompetitionScope;
import com.edu.po.CompetitionScopeCustom;

import java.util.List;

public interface CompetitionScopeService {

    void addCompScopeByCidVal(Integer compId, String grade);

    List<CompetitionScopeCustom> getCompScopeByCid(Integer compId);
}
