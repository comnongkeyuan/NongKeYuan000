package com.mapper;

import com.bean.SampleToxin;
import com.bean.SampleToxinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleToxinMapper {
    int countByExample(SampleToxinExample example);

    int deleteByExample(SampleToxinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SampleToxin record);

    int insertSelective(SampleToxin record);

    List<SampleToxin> selectByExample(SampleToxinExample example);

    SampleToxin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SampleToxin record, @Param("example") SampleToxinExample example);

    int updateByExample(@Param("record") SampleToxin record, @Param("example") SampleToxinExample example);

    int updateByPrimaryKeySelective(SampleToxin record);

    int updateByPrimaryKey(SampleToxin record);
}