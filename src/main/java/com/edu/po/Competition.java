package com.edu.po;

import java.util.Date;

public class Competition {
    private Integer compId;

    private String teacherId;

    private String compName;

    private String compDesc;

    private String isPro;

    private String isPer;

    private Date applyTime;

    private Date beginTime;

    private Date endTime;

    private String compStatus;

    private String isDel;

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    public String getCompDesc() {
        return compDesc;
    }

    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc == null ? null : compDesc.trim();
    }

    public String getIsPro() {
        return isPro;
    }

    public void setIsPro(String isPro) {
        this.isPro = isPro == null ? null : isPro.trim();
    }

    public String getIsPer() {
        return isPer;
    }

    public void setIsPer(String isPer) {
        this.isPer = isPer == null ? null : isPer.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCompStatus() {
        return compStatus;
    }

    public void setCompStatus(String compStatus) {
        this.compStatus = compStatus == null ? null : compStatus.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}