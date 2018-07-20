package com.mapper;

import com.bean.AddressTown;
import com.bean.AddressTownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressTownMapper {
    int countByExample(AddressTownExample example);

    int deleteByExample(AddressTownExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AddressTown record);

    int insertSelective(AddressTown record);

    List<AddressTown> selectByExample(AddressTownExample example);

    AddressTown selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AddressTown record, @Param("example") AddressTownExample example);

    int updateByExample(@Param("record") AddressTown record, @Param("example") AddressTownExample example);

    int updateByPrimaryKeySelective(AddressTown record);

    int updateByPrimaryKey(AddressTown record);
}