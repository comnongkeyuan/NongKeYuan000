package com.bean;

public class SampleInfoWithBLOBs extends SampleInfo {
    /** 采集时季节及气候特征*/
    private String seasonal;

    /** 采集地、环境信息描述*/
    private String description;

    public String getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(String seasonal) {
        this.seasonal = seasonal == null ? null : seasonal.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}