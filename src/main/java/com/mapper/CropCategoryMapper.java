package com.mapper;

import com.bean.CropCategory;
import com.bean.CropCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CropCategoryMapper {
    int countByExample(CropCategoryExample example);

    int deleteByExample(CropCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CropCategory record);

    int insertSelective(CropCategory record);

    List<CropCategory> selectByExample(CropCategoryExample example);

    CropCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CropCategory record, @Param("example") CropCategoryExample example);

    int updateByExample(@Param("record") CropCategory record, @Param("example") CropCategoryExample example);

    int updateByPrimaryKeySelective(CropCategory record);

    int updateByPrimaryKey(CropCategory record);
}