package com.edu.service.impl;

import com.edu.mapper.EntrySlaveMapper;
import com.edu.po.*;
import com.edu.service.EntrySlaService;
import com.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EntrySlaServiceImpl implements EntrySlaService {

    @Autowired
    private EntrySlaveMapper entrySlaveMapper;

    @Autowired
    private StudentService studentService;

    // 将 EntrySlave 类型转换成 EntrySlaCustom 类型
    public EntrySlaCustom transformToEntrySlaCustom(EntrySlave entrySlave) {
        EntrySlaCustom entrySlaCustom = new EntrySlaCustom();
        if (entrySlave != null){
            entrySlaCustom.setEntrySlaveId(entrySlave.getEntrySlaveId());
            entrySlaCustom.setEntryId(entrySlave.getEntryId());
            entrySlaCustom.setStudentId(entrySlave.getStudentId());
            entrySlaCustom.setPhone(entrySlave.getPhone());
            entrySlaCustom.setIsDel(entrySlave.getIsDel());

            StudentCustom studentCustom = studentService.getStudentCBySId(entrySlave.getStudentId());
            entrySlaCustom.setStudentName(studentCustom.getStudentName());
        }

        return entrySlaCustom;
    }

    // 将 EntrySlave 类型的list，转换成 EntrySlaCustom 类型的list
    public List<EntrySlaCustom> transformToEntrySlaCustomList(List<EntrySlave> entrySlaveList) {
        List<EntrySlaCustom> entrySlaCustomList = new ArrayList<>();
        for (EntrySlave entrySlave : entrySlaveList) {
            entrySlaCustomList.add(transformToEntrySlaCustom(entrySlave));
        }
        return entrySlaCustomList;
    }

    @Override
    public void addEntrySalAll(EntrySlaQueryVo entrySlaQueryVo) {
        for (EntrySlaCustom entrySlaCustom : entrySlaQueryVo.getEntrySlaCustomList()){
            entrySlaCustom.setIsDel("N");
            entrySlaveMapper.insertSelective(entrySlaCustom);
        }
    }

    @Override
    public List<EntrySlaCustom> getEntrySlaByEid(Integer entryId) {
        EntrySlaveExample entrySlaveExample = new EntrySlaveExample();
        EntrySlaveExample.Criteria criteria = entrySlaveExample.createCriteria();
        criteria.andEntryIdEqualTo(entryId);
        return transformToEntrySlaCustomList(entrySlaveMapper.selectByExample(entrySlaveExample));
    }
}
