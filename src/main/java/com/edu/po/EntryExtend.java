package com.edu.po;

public class EntryExtend {
    private Integer entryExtendId;

    private Integer entryId;

    private Integer compExtendId;

    private String extendValue;

    private String isDel;

    public Integer getEntryExtendId() {
        return entryExtendId;
    }

    public void setEntryExtendId(Integer entryExtendId) {
        this.entryExtendId = entryExtendId;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public Integer getCompExtendId() {
        return compExtendId;
    }

    public void setCompExtendId(Integer compExtendId) {
        this.compExtendId = compExtendId;
    }

    public String getExtendValue() {
        return extendValue;
    }

    public void setExtendValue(String extendValue) {
        this.extendValue = extendValue == null ? null : extendValue.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}