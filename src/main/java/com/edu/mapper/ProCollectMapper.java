package com.edu.mapper;

import com.edu.po.ProCollect;
import com.edu.po.ProCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProCollectMapper {
    long countByExample(ProCollectExample example);

    int deleteByExample(ProCollectExample example);

    int deleteByPrimaryKey(Integer proColId);

    int insert(ProCollect record);

    int insertSelective(ProCollect record);

    List<ProCollect> selectByExample(ProCollectExample example);

    ProCollect selectByPrimaryKey(Integer proColId);

    int updateByExampleSelective(@Param("record") ProCollect record, @Param("example") ProCollectExample example);

    int updateByExample(@Param("record") ProCollect record, @Param("example") ProCollectExample example);

    int updateByPrimaryKeySelective(ProCollect record);

    int updateByPrimaryKey(ProCollect record);
}