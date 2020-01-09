package com.edu.service;

import com.edu.po.ProColCustom;

import java.util.List;

public interface ProColService {
    void addProColByEid(Integer entryId, String originalName, String proLink);
    List<ProColCustom> getProColByEid(Integer entryId);
}
