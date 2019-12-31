package com.edu.mapper;

import com.edu.po.Entry;
import com.edu.po.EntryExample;
import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface EntryMapper {
    long countByExample(EntryExample example);

    int deleteByExample(EntryExample example);

    int deleteByPrimaryKey(Integer entryId);

    int insert(Entry record);

    int insertSelective(Entry record);

    List<Entry> selectByExample(EntryExample example);

    Entry selectByPrimaryKey(Integer entryId);

    int updateByExampleSelective(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByExample(@Param("record") Entry record, @Param("example") EntryExample example);

    int updateByPrimaryKeySelective(Entry record);

    int updateByPrimaryKey(Entry record);
}