package com.edu.service;

import com.edu.po.EntryExtCustom;
import com.edu.po.EntryExtQueryVo;

import java.util.List;

public interface EntryExtService {
    void addEntryExtAll(EntryExtQueryVo entryExtQueryVo);

    List<EntryExtCustom> getEntryExtByEid(Integer entryId);
}
