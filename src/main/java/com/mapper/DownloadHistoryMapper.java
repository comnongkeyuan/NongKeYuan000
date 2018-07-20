package com.mapper;

import com.bean.DownloadHistory;
import com.bean.DownloadHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadHistoryMapper {
    int countByExample(DownloadHistoryExample example);

    int deleteByExample(DownloadHistoryExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(DownloadHistory record);

    int insertSelective(DownloadHistory record);

    List<DownloadHistory> selectByExample(DownloadHistoryExample example);

    DownloadHistory selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") DownloadHistory record, @Param("example") DownloadHistoryExample example);

    int updateByExample(@Param("record") DownloadHistory record, @Param("example") DownloadHistoryExample example);

    int updateByPrimaryKeySelective(DownloadHistory record);

    int updateByPrimaryKey(DownloadHistory record);
}