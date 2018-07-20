package com.mapper;

import com.bean.SampleInfo;
import com.bean.SampleInfoExample;
import com.bean.SampleInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleInfoMapper {
    int countByExample(SampleInfoExample example);

    int deleteByExample(SampleInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SampleInfoWithBLOBs record);

    int insertSelective(SampleInfoWithBLOBs record);

    List<SampleInfoWithBLOBs> selectByExampleWithBLOBs(SampleInfoExample example);

    List<SampleInfo> selectByExample(SampleInfoExample example);

    SampleInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SampleInfoWithBLOBs record, @Param("example") SampleInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SampleInfoWithBLOBs record, @Param("example") SampleInfoExample example);

    int updateByExample(@Param("record") SampleInfo record, @Param("example") SampleInfoExample example);

    int updateByPrimaryKeySelective(SampleInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SampleInfoWithBLOBs record);

    int updateByPrimaryKey(SampleInfo record);
}