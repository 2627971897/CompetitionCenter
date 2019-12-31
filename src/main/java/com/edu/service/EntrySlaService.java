package com.edu.service;

import com.edu.po.EntrySlaCustom;
import com.edu.po.EntrySlaQueryVo;

import java.util.List;

public interface EntrySlaService {
    void addEntrySalAll(EntrySlaQueryVo entrySlaQueryVo);

    List<EntrySlaCustom> getEntrySlaByEid(Integer entryId);
}
