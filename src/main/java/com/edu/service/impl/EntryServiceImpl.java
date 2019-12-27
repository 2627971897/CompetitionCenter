package com.edu.service.impl;

import com.edu.mapper.EntryMapper;
import com.edu.po.EntryCustom;
import com.edu.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class EntryServiceImpl implements EntryService {
    @Autowired
    private EntryMapper entryMapper;
    @Override
    public void addEntry(EntryCustom entryCustom) {
        entryCustom.setEntryDate(new Date());
        entryCustom.setEntryStatus("1");
        entryMapper.insertSelective(entryCustom);
    }
}
