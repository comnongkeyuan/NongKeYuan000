package com.mapper;

import com.bean.SampleToxinInfo;
import com.bean.SampleToxinInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleToxinInfoMapper {
    int countByExample(SampleToxinInfoExample example);

    int deleteByExample(SampleToxinInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SampleToxinInfo record);

    int insertSelective(SampleToxinInfo record);

    List<SampleToxinInfo> selectByExample(SampleToxinInfoExample example);

    SampleToxinInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SampleToxinInfo record, @Param("example") SampleToxinInfoExample example);

    int updateByExample(@Param("record") SampleToxinInfo record, @Param("example") SampleToxinInfoExample example);

    int updateByPrimaryKeySelective(SampleToxinInfo record);

    int updateByPrimaryKey(SampleToxinInfo record);
}