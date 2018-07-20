package com.mapper;

import com.bean.LookHistory;
import com.bean.LookHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LookHistoryMapper {
    int countByExample(LookHistoryExample example);

    int deleteByExample(LookHistoryExample example);

    int deleteByPrimaryKey(Integer lId);

    int insert(LookHistory record);

    int insertSelective(LookHistory record);

    List<LookHistory> selectByExample(LookHistoryExample example);

    LookHistory selectByPrimaryKey(Integer lId);

    int updateByExampleSelective(@Param("record") LookHistory record, @Param("example") LookHistoryExample example);

    int updateByExample(@Param("record") LookHistory record, @Param("example") LookHistoryExample example);

    int updateByPrimaryKeySelective(LookHistory record);

    int updateByPrimaryKey(LookHistory record);
}