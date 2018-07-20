package com.bean;

import java.util.Date;

public class LookHistory {
    /** 浏览表主键*/
    private Integer lId;

    /** 样品表主键*/
    private Integer sampleId;

    /** 浏览人主键*/
    private Integer userId;

    /** 创建时间*/
    private Date createTime;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
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