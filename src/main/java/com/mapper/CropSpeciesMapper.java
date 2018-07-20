package com.mapper;

import com.bean.CropSpecies;
import com.bean.CropSpeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CropSpeciesMapper {
    int countByExample(CropSpeciesExample example);

    int deleteByExample(CropSpeciesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CropSpecies record);

    int insertSelective(CropSpecies record);

    List<CropSpecies> selectByExample(CropSpeciesExample example);

    CropSpecies selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CropSpecies record, @Param("example") CropSpeciesExample example);

    int updateByExample(@Param("record") CropSpecies record, @Param("example") CropSpeciesExample example);

    int updateByPrimaryKeySelective(CropSpecies record);

    int updateByPrimaryKey(CropSpecies record);
}