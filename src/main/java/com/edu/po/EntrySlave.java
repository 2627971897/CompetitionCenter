package com.edu.po;

public class EntrySlave {
    private Integer entrySlaveId;

    private Integer entryId;

    private String studentId;

    private String phone;

    public Integer getEntrySlaveId() {
        return entrySlaveId;
    }

    public void setEntrySlaveId(Integer entrySlaveId) {
        this.entrySlaveId = entrySlaveId;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}