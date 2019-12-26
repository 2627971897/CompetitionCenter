package com.edu.service;

import com.edu.po.CompetitionCustom;

import java.util.List;

public interface CompetitionService {
    void addCompetition(CompetitionCustom competitionCustom);

    List<CompetitionCustom> getCompByTid(String teacherId);

    List<CompetitionCustom> getCompAll();

    List<CompetitionCustom> getCompByStatus(String compStatus);

    void auditPassCompByCid(Integer compId);

    CompetitionCustom getCompByCid(Integer compId);

    void auditNoPassCompByCid(Integer compId);
}
