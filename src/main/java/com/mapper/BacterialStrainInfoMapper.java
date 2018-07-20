package com.mapper;

import com.bean.BacterialStrainInfo;
import com.bean.BacterialStrainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BacterialStrainInfoMapper {
    int countByExample(BacterialStrainInfoExample example);

    int deleteByExample(BacterialStrainInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BacterialStrainInfo record);

    int insertSelective(BacterialStrainInfo record);

    List<BacterialStrainInfo> selectByExample(BacterialStrainInfoExample example);

    BacterialStrainInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BacterialStrainInfo record, @Param("example") BacterialStrainInfoExample example);

    int updateByExample(@Param("record") BacterialStrainInfo record, @Param("example") BacterialStrainInfoExample example);

    int updateByPrimaryKeySelective(BacterialStrainInfo record);

    int updateByPrimaryKey(BacterialStrainInfo record);
}