package com.edu.po;

public class School {
    private Integer schoolId;

    private String schoolAccount;

    private String schoolPwd;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolAccount() {
        return schoolAccount;
    }

    public void setSchoolAccount(String schoolAccount) {
        this.schoolAccount = schoolAccount == null ? null : schoolAccount.trim();
    }

    public String getSchoolPwd() {
        return schoolPwd;
    }

    public void setSchoolPwd(String schoolPwd) {
        this.schoolPwd = schoolPwd == null ? null : schoolPwd.trim();
    }
}