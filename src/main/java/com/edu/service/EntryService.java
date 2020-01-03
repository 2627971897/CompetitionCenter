package com.edu.service;

import com.edu.po.EntryCustom;

import java.util.List;

public interface EntryService {
    EntryCustom addEntryRetId(EntryCustom entryCustom);

    EntryCustom getEntryByEid(Integer entryId);

    void changeStaEntryByEid(Integer entryId, String entryStatus);

    List<EntryCustom> getEntryAllBySid(String studentId);

    EntryCustom getEntryOneByEid(Integer entryId);

    List<EntryCustom> getEntryByCidSta(Integer compId);

    List<EntryCustom> getEntryByCidSta(Integer compId, String entryStatus);

    List<EntryCustom> getEntryByCidSta(Integer compId, String entryStatus1, String entryStatus2);

    void giveScoreByEid(Integer entryId, String score);

    List<EntryCustom> getEntryByCidNotInSta(Integer compId, String entryStatus1, String entryStatus2);

    void changeStaToStaEntryByCid(Integer compId, String entryStatus1, String entryStatus2);
}
