package com.edu.po;

import java.util.List;

public class EntryCustom extends Entry {
    private String isPro;

    private String studentName;

    private String compName;

    private ProColCustom proColCustom;

    private List<EntryExtCustom> entryExtCustomList;

    private List<EntrySlaCustom> entrySlaCustomList;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public List<EntryExtCustom> getEntryExtCustomList() {
        return entryExtCustomList;
    }

    public void setEntryExtCustomList(List<EntryExtCustom> entryExtCustomList) {
        this.entryExtCustomList = entryExtCustomList;
    }

    public List<EntrySlaCustom> getEntrySlaCustomList() {
        return entrySlaCustomList;
    }

    public void setEntrySlaCustomList(List<EntrySlaCustom> entrySlaCustomList) {
        this.entrySlaCustomList = entrySlaCustomList;
    }

    public String getIsPro() {
        return isPro;
    }

    public void setIsPro(String isPro) {
        this.isPro = isPro;
    }

    public ProColCustom getProColCustom() {
        return proColCustom;
    }

    public void setProColCustom(ProColCustom proColCustom) {
        this.proColCustom = proColCustom;
    }
}
