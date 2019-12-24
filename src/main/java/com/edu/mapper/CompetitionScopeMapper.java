package com.edu.mapper;

import com.edu.po.CompetitionScope;
import com.edu.po.CompetitionScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionScopeMapper {
    long countByExample(CompetitionScopeExample example);

    int deleteByExample(CompetitionScopeExample example);

    int deleteByPrimaryKey(Integer compScopeId);

    int insert(CompetitionScope record);

    int insertSelective(CompetitionScope record);

    List<CompetitionScope> selectByExample(CompetitionScopeExample example);

    CompetitionScope selectByPrimaryKey(Integer compScopeId);

    int updateByExampleSelective(@Param("record") CompetitionScope record, @Param("example") CompetitionScopeExample example);

    int updateByExample(@Param("record") CompetitionScope record, @Param("example") CompetitionScopeExample example);

    int updateByPrimaryKeySelective(CompetitionScope record);

    int updateByPrimaryKey(CompetitionScope record);
}