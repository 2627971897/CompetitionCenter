package com.edu.service;

import com.edu.po.CompetitionExtCustom;
import com.edu.po.CompetitionExtend;

import java.util.List;

public interface CompetitionExtService {

    void addCompExtByCidExtKey(Integer compId, String myExtend);

    List<CompetitionExtCustom> getCompExtByCid(Integer compId);

    CompetitionExtCustom getCompExtByCEid(Integer compExtendId);
}
