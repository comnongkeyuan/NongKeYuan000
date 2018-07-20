package com.bean;

import java.util.Date;

public class DownloadHistory {
    /** 下载表主键*/
    private Integer dId;

    /** 样品id*/
    private Integer sampleId;

    /** 下载人id*/
    private Integer userId;

    /** 下载时间*/
    private Date createTime;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}