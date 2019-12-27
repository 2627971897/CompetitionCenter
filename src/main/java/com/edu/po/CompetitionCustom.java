package com.edu.po;

import java.util.List;

public class CompetitionCustom extends Competition{
    private String teacherName;

    private List<CompetitionScopeCustom> competitionScopeCustomList;

    private List<CompetitionObjCustom> competitionObjCustomList;

    private List<CompetitionExtCustom> competitionExtCustomList;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<CompetitionScopeCustom> getCompetitionScopeCustomList() {
        return competitionScopeCustomList;
    }

    public void setCompetitionScopeCustomList(List<CompetitionScopeCustom> competitionScopeCustomList) {
        this.competitionScopeCustomList = competitionScopeCustomList;
    }

    public List<CompetitionObjCustom> getCompetitionObjCustomList() {
        return competitionObjCustomList;
    }

    public void setCompetitionObjCustomList(List<CompetitionObjCustom> competitionObjCustomList) {
        this.competitionObjCustomList = competitionObjCustomList;
    }

    public List<CompetitionExtCustom> getCompetitionExtCustomList() {
        return competitionExtCustomList;
    }

    public void setCompetitionExtCustomList(List<CompetitionExtCustom> competitionExtCustomList) {
        this.competitionExtCustomList = competitionExtCustomList;
    }
}
