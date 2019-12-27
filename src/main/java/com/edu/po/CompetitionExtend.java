package com.edu.po;

public class CompetitionExtend {
    private Integer compExtendId;

    private Integer compId;

    private String extendKey;

    private String isDel;

    public Integer getCompExtendId() {
        return compExtendId;
    }

    public void setCompExtendId(Integer compExtendId) {
        this.compExtendId = compExtendId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getExtendKey() {
        return extendKey;
    }

    public void setExtendKey(String extendKey) {
        this.extendKey = extendKey == null ? null : extendKey.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}