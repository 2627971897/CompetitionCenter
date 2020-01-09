package com.edu.service.impl;

import com.edu.mapper.ProCollectMapper;
import com.edu.po.ProColCustom;
import com.edu.po.ProCollect;
import com.edu.po.ProCollectExample;
import com.edu.service.ProColService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProColServiceImpl implements ProColService {

    @Autowired
    private ProCollectMapper proCollectMapper;

    // 将 ProCollect 类型转换成 ProColCustom 类型
    public ProColCustom transformToProColCustom(ProCollect proCollect) {
        ProColCustom proColCustom = new ProColCustom();
        if (proCollect != null){
            proColCustom.setProColId(proCollect.getProColId());
            proColCustom.setEntryId(proCollect.getEntryId());
            proColCustom.setProName(proCollect.getProName());
            proColCustom.setProLink(proCollect.getProLink());
            proColCustom.setProColTime(proCollect.getProColTime());
            proColCustom.setIsDel(proCollect.getIsDel());
        }

        return proColCustom;
    }

    // 将 ProCollectList 类型转换成 ProColCustomList 类型
    public List<ProColCustom> transformToProColCustomList(List<ProCollect> proCollectList) {
        List<ProColCustom> proColCustomList = new ArrayList<>();
        for (ProCollect proCollect : proCollectList){
            proColCustomList.add(transformToProColCustom(proCollect));
        }
        return proColCustomList;
    }

    @Override
    public void addProColByEid(Integer entryId, String originalName, String proLink) {
        ProCollect proCollect = new ProCollect();
        proCollect.setEntryId(entryId);
        proCollect.setProName(originalName);
        proCollect.setProLink(proLink);
        proCollect.setProColTime(new Date());
        proCollectMapper.insertSelective(proCollect);
    }

    @Override
    public List<ProColCustom> getProColByEid(Integer entryId) {
        ProCollectExample proCollectExample = new ProCollectExample();
        ProCollectExample.Criteria criteria = proCollectExample.createCriteria();
        criteria.andEntryIdEqualTo(entryId);
        return transformToProColCustomList(proCollectMapper.selectByExample(proCollectExample));
    }
}
