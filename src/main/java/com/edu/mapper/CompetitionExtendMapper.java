package com.edu.mapper;

import com.edu.po.CompetitionExtend;
import com.edu.po.CompetitionExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionExtendMapper {
    long countByExample(CompetitionExtendExample example);

    int deleteByExample(CompetitionExtendExample example);

    int deleteByPrimaryKey(Integer compExtendId);

    int insert(CompetitionExtend record);

    int insertSelective(CompetitionExtend record);

    List<CompetitionExtend> selectByExample(CompetitionExtendExample example);

    CompetitionExtend selectByPrimaryKey(Integer compExtendId);

    int updateByExampleSelective(@Param("record") CompetitionExtend record, @Param("example") CompetitionExtendExample example);

    int updateByExample(@Param("record") CompetitionExtend record, @Param("example") CompetitionExtendExample example);

    int updateByPrimaryKeySelective(CompetitionExtend record);

    int updateByPrimaryKey(CompetitionExtend record);
}