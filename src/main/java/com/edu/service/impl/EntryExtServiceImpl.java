package com.edu.service.impl;

import com.edu.mapper.EntryExtendMapper;
import com.edu.po.*;
import com.edu.service.CompetitionExtService;
import com.edu.service.EntryExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EntryExtServiceImpl implements EntryExtService {

    @Autowired
    private EntryExtendMapper entryExtendMapper;

    @Autowired
    private CompetitionExtService competitionExtService;

    // 将 EntryExtend 类型转换成 EntryExtCustom 类型
    public EntryExtCustom transformToEntryExtCustom(EntryExtend entryExtend) {
        EntryExtCustom entryExtCustom = new EntryExtCustom();
        if (entryExtend != null){
            entryExtCustom.setEntryExtendId(entryExtend.getEntryExtendId());
            entryExtCustom.setEntryId(entryExtend.getEntryId());
            entryExtCustom.setCompExtendId(entryExtend.getCompExtendId());
            entryExtCustom.setExtendValue(entryExtend.getExtendValue());
            entryExtCustom.setIsDel(entryExtend.getIsDel());

            CompetitionExtCustom competitionExtCustom = competitionExtService.getCompExtByCEid(entryExtend.getCompExtendId());
            entryExtCustom.setExtendKey(competitionExtCustom.getExtendKey());
        }
        return entryExtCustom;
    }

    // 将 EntryExtend 类型的list，转换成 EntryExtCustom 类型的list
    public List<EntryExtCustom> transformToEntryExtCustomList(List<EntryExtend> entryExtendList) {
        List<EntryExtCustom> entryExtCustomList = new ArrayList<>();
        for (EntryExtend entryExtend : entryExtendList) {
            entryExtCustomList.add(transformToEntryExtCustom(entryExtend));
        }
        return entryExtCustomList;
    }


    @Override
    public void addEntryExtAll(EntryExtQueryVo entryExtQueryVo) {
        for (EntryExtCustom entryExtCustom : entryExtQueryVo.getEntryExtCustomList()){
            entryExtCustom.setIsDel("N");
            entryExtendMapper.insertSelective(entryExtCustom);
        }
    }

    @Override
    public List<EntryExtCustom> getEntryExtByEid(Integer entryId) {
        EntryExtendExample entryExtendExample = new EntryExtendExample();
        EntryExtendExample.Criteria criteria = entryExtendExample.createCriteria();
        criteria.andEntryIdEqualTo(entryId);
        return transformToEntryExtCustomList(entryExtendMapper.selectByExample(entryExtendExample));
    }
}
