package com.edu.po;

public class CompetitionObject {
    private Integer compObjectId;

    private Integer compId;

    private Integer deptId;

    private String isDel;

    public Integer getCompObjectId() {
        return compObjectId;
    }

    public void setCompObjectId(Integer compObjectId) {
        this.compObjectId = compObjectId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}