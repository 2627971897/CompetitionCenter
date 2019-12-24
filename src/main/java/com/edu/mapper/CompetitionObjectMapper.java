package com.edu.mapper;

import com.edu.po.CompetitionObject;
import com.edu.po.CompetitionObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionObjectMapper {
    long countByExample(CompetitionObjectExample example);

    int deleteByExample(CompetitionObjectExample example);

    int deleteByPrimaryKey(Integer compObjectId);

    int insert(CompetitionObject record);

    int insertSelective(CompetitionObject record);

    List<CompetitionObject> selectByExample(CompetitionObjectExample example);

    CompetitionObject selectByPrimaryKey(Integer compObjectId);

    int updateByExampleSelective(@Param("record") CompetitionObject record, @Param("example") CompetitionObjectExample example);

    int updateByExample(@Param("record") CompetitionObject record, @Param("example") CompetitionObjectExample example);

    int updateByPrimaryKeySelective(CompetitionObject record);

    int updateByPrimaryKey(CompetitionObject record);
}