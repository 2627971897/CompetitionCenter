package com.edu.po;

public class CompetitionScope {
    private Integer compScopeId;

    private Integer compId;

    private String value;

    private String isDel;

    public Integer getCompScopeId() {
        return compScopeId;
    }

    public void setCompScopeId(Integer compScopeId) {
        this.compScopeId = compScopeId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}