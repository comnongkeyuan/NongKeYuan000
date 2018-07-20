package com.bean;

public class CropSpecies {
    /** 农作物种类主键*/
    private Integer id;

    /** 种类名称*/
    private String cropSpecies;

    /** 类别id*/
    private Integer cropCategoryId;

    /** 1是启用，0是禁用*/
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCropSpecies() {
        return cropSpecies;
    }

    public void setCropSpecies(String cropSpecies) {
        this.cropSpecies = cropSpecies == null ? null : cropSpecies.trim();
    }

    public Integer getCropCategoryId() {
        return cropCategoryId;
    }

    public void setCropCategoryId(Integer cropCategoryId) {
        this.cropCategoryId = cropCategoryId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}