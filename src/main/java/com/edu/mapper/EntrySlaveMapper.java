package com.edu.mapper;

import com.edu.po.EntrySlave;
import com.edu.po.EntrySlaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntrySlaveMapper {
    long countByExample(EntrySlaveExample example);

    int deleteByExample(EntrySlaveExample example);

    int deleteByPrimaryKey(Integer entrySlaveId);

    int insert(EntrySlave record);

    int insertSelective(EntrySlave record);

    List<EntrySlave> selectByExample(EntrySlaveExample example);

    EntrySlave selectByPrimaryKey(Integer entrySlaveId);

    int updateByExampleSelective(@Param("record") EntrySlave record, @Param("example") EntrySlaveExample example);

    int updateByExample(@Param("record") EntrySlave record, @Param("example") EntrySlaveExample example);

    int updateByPrimaryKeySelective(EntrySlave record);

    int updateByPrimaryKey(EntrySlave record);
}