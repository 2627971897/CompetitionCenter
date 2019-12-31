package com.edu.service;

import com.edu.po.EntryCustom;

import java.util.List;

public interface EntryService {
    EntryCustom addEntryRetId(EntryCustom entryCustom);

    EntryCustom getEntryByEid(Integer entryId);

    void changeStaEntryByEid(Integer entryId, String entryStatus);

    List<EntryCustom> getEntryAllBySid(String studentId);

    EntryCustom getEntryOneByEid(Integer entryId);
}
