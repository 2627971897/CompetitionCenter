package com.edu.po;

import java.util.Date;

public class ProCollect {
    private Integer proColId;

    private Integer entryId;

    private String proName;

    private String proLink;

    private Date proColTime;

    private String isDel;

    public Integer getProColId() {
        return proColId;
    }

    public void setProColId(Integer proColId) {
        this.proColId = proColId;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProLink() {
        return proLink;
    }

    public void setProLink(String proLink) {
        this.proLink = proLink == null ? null : proLink.trim();
    }

    public Date getProColTime() {
        return proColTime;
    }

    public void setProColTime(Date proColTime) {
        this.proColTime = proColTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}