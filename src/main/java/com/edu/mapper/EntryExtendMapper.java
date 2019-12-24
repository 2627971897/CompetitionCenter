package com.edu.mapper;

import com.edu.po.EntryExtend;
import com.edu.po.EntryExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntryExtendMapper {
    long countByExample(EntryExtendExample example);

    int deleteByExample(EntryExtendExample example);

    int deleteByPrimaryKey(Integer entryExtendId);

    int insert(EntryExtend record);

    int insertSelective(EntryExtend record);

    List<EntryExtend> selectByExample(EntryExtendExample example);

    EntryExtend selectByPrimaryKey(Integer entryExtendId);

    int updateByExampleSelective(@Param("record") EntryExtend record, @Param("example") EntryExtendExample example);

    int updateByExample(@Param("record") EntryExtend record, @Param("example") EntryExtendExample example);

    int updateByPrimaryKeySelective(EntryExtend record);

    int updateByPrimaryKey(EntryExtend record);
}