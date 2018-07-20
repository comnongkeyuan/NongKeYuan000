package com.bean;

public class Par {
    /** */
    private Integer id;

    /** 样品表中种类id*/
    private Integer breedId;

    /** 种类名称*/
    private String breedName;

    /** 毒素表主键id*/
    private Integer toxinId;

    /** 毒素名称*/
    private String toxinName;

    /** 毒素标准含量*/
    private Float par;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBreedId() {
        return breedId;
    }

    public void setBreedId(Integer breedId) {
        this.breedId = breedId;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName == null ? null : breedName.trim();
    }

    public Integer getToxinId() {
        return toxinId;
    }

    public void setToxinId(Integer toxinId) {
        this.toxinId = toxinId;
    }

    public String getToxinName() {
        return toxinName;
    }

    public void setToxinName(String toxinName) {
        this.toxinName = toxinName == null ? null : toxinName.trim();
    }

    public Float getPar() {
        return par;
    }

    public void setPar(Float par) {
        this.par = par;
    }
}