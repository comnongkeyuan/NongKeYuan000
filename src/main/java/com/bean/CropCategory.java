package com.bean;

public class CropCategory {
    /** 农作物类别表主键*/
    private Integer id;

    /** 农作物类别表*/
    private String cropCategory;

    /** 启用1，禁用是0*/
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCropCategory() {
        return cropCategory;
    }

    public void setCropCategory(String cropCategory) {
        this.cropCategory = cropCategory == null ? null : cropCategory.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}