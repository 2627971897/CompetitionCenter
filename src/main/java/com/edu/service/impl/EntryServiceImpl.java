package com.edu.service.impl;

import com.edu.mapper.EntryMapper;
import com.edu.po.*;
import com.edu.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class EntryServiceImpl implements EntryService {
    @Autowired
    private EntryMapper entryMapper;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CompetitionService competitionService;

    @Autowired
    private EntryExtService entryExtService;

    @Autowired
    private EntrySlaService entrySlaService;

    // 将 Entry 类型转换成 EntryCustom 类型
    public EntryCustom transformToEntryCustom(Entry entry) {
        EntryCustom entryCustom = new EntryCustom();
        if (entry != null){
            entryCustom.setEntryId(entry.getEntryId());
            entryCustom.setStudentId(entry.getStudentId());
            entryCustom.setCompId(entry.getCompId());
            entryCustom.setPhone(entry.getPhone());
            entryCustom.setIsPer(entry.getIsPer());
            entryCustom.setTeamName(entry.getTeamName());
            entryCustom.setEntryDate(entry.getEntryDate());
            entryCustom.setEntryStatus(entry.getEntryStatus());
            entryCustom.setScore(entry.getScore());
            entryCustom.setIsDel(entry.getIsDel());

            StudentCustom studentCustom = studentService.getStudentCBySId(entry.getStudentId());
            entryCustom.setStudentName(studentCustom.getStudentName());

            CompetitionCustom competitionCustom = competitionService.getCompByCid(entry.getCompId());
            entryCustom.setCompName(competitionCustom.getCompName());
            entryCustom.setIsPro(competitionCustom.getIsPro());

            List<EntryExtCustom> entryExtCustomList = entryExtService.getEntryExtByEid(entry.getEntryId());
            entryCustom.setEntryExtCustomList(entryExtCustomList);

            List<EntrySlaCustom> entrySlaCustomList = entrySlaService.getEntrySlaByEid(entry.getEntryId());
            entryCustom.setEntrySlaCustomList(entrySlaCustomList);
        }

        return entryCustom;
    }

    // 将 EntryList 类型转换成 EntryCustomList 类型
    public List<EntryCustom> transformToEntryCustomList(List<Entry> entryList) {
        List<EntryCustom> entryCustomList = new ArrayList<>();
        for (Entry entry : entryList){
            entryCustomList.add(transformToEntryCustom(entry));
        }

        return entryCustomList;
    }

    @Override
    public EntryCustom addEntryRetId(EntryCustom entryCustom) {
        entryCustom.setEntryDate(new Date());
        entryCustom.setEntryStatus("1");
        entryMapper.insertSelective(entryCustom);
        return  entryCustom;
    }

    @Override
    public EntryCustom getEntryByEid(Integer entryId) {

        return transformToEntryCustom(entryMapper.selectByPrimaryKey(entryId));
    }

    @Override
    public void changeStaEntryByEid(Integer entryId, String entryStatus) {
        Entry entry = new Entry();
        entry.setEntryId(entryId);
        entry.setEntryStatus(entryStatus);
        entryMapper.updateByPrimaryKeySelective(entry);
    }

    @Override
    public List<EntryCustom> getEntryAllBySid(String studentId) {
        EntryExample entryExample = new EntryExample();
        EntryExample.Criteria criteria = entryExample.createCriteria();
        criteria.andStudentIdEqualTo(studentId);
        return transformToEntryCustomList(entryMapper.selectByExample(entryExample));
    }

    @Override
    public EntryCustom getEntryOneByEid(Integer entryId) {
        return transformToEntryCustom(entryMapper.selectByPrimaryKey(entryId));
    }

    @Override
    public List<EntryCustom> getEntryByCidSta(Integer compId) {
        EntryExample entryExample = new EntryExample();
        EntryExample.Criteria criteria = entryExample.createCriteria();
        criteria.andCompIdEqualTo(compId);
        return transformToEntryCustomList(entryMapper.selectByExample(entryExample));
    }

    @Override
    public List<EntryCustom> getEntryByCidSta(Integer compId, String entryStatus) {
        EntryExample entryExample = new EntryExample();
        EntryExample.Criteria criteria = entryExample.createCriteria();
        criteria.andCompIdEqualTo(compId);
        criteria.andEntryStatusEqualTo(entryStatus);
        return transformToEntryCustomList(entryMapper.selectByExample(entryExample));
    }

    @Override
    public List<EntryCustom> getEntryByCidSta(Integer compId, String entryStatus1, String entryStatus2) {
        EntryExample entryExample = new EntryExample();
        EntryExample.Criteria criteria = entryExample.createCriteria();
        criteria.andCompIdEqualTo(compId);
        List<String> entryStatusList = new ArrayList<>();
        entryStatusList.add(entryStatus1);
        entryStatusList.add(entryStatus2);
        criteria.andEntryStatusIn(entryStatusList);
        return transformToEntryCustomList(entryMapper.selectByExample(entryExample));
    }
}
