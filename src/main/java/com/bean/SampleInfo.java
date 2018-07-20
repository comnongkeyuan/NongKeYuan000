package com.bean;

import java.util.Date;

public class SampleInfo {
    /** 采样信息主键*/
    private Integer id;

    /** 样品编号*/
    private String sampleId;

    /** 农产品加工原料类别id*/
    private Integer cropCategoryId;

    /** 品种*/
    private Integer breed;

    /** 省*/
    private String province;

    /** 市*/
    private String city;

    /** 县*/
    private String county;

    /** 乡*/
    private String township;

    /** 村*/
    private String village;

    /** 户*/
    private String household;

    /** 收获时间*/
    private Date harvestTime;

    /** 取样时间*/
    private Date samplingTime;

    /** 取样人*/
    private String samplingPeople;

    /** 毒素表id*/
    private Integer toxinId;

    /** 毒素含量*/
    private Float toxinCount;

    /** 真菌污染率*/
    private Float pollutionRate;

    /** 创建时间*/
    private Date createTime;

    /** 查看权限12345*/
    private Integer checkPermissions;

    /** 下载权限*/
    private Integer downloadPrivileges;

    /** 是否删除0未删除1删除*/
    private Integer isdel;

    /** 录入时间*/
    private Date inputTime;

    /** */
    private Integer flag;

    /** 录入人（信息管理员）*/
    private Integer enterpeople;

    /** 导入品种字段*/
    private String varieties;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId == null ? null : sampleId.trim();
    }

    public Integer getCropCategoryId() {
        return cropCategoryId;
    }

    public void setCropCategoryId(Integer cropCategoryId) {
        this.cropCategoryId = cropCategoryId;
    }

    public Integer getBreed() {
        return breed;
    }

    public void setBreed(Integer breed) {
        this.breed = breed;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township == null ? null : township.trim();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household == null ? null : household.trim();
    }

    public Date getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(Date harvestTime) {
        this.harvestTime = harvestTime;
    }

    public Date getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(Date samplingTime) {
        this.samplingTime = samplingTime;
    }

    public String getSamplingPeople() {
        return samplingPeople;
    }

    public void setSamplingPeople(String samplingPeople) {
        this.samplingPeople = samplingPeople == null ? null : samplingPeople.trim();
    }

    public Integer getToxinId() {
        return toxinId;
    }

    public void setToxinId(Integer toxinId) {
        this.toxinId = toxinId;
    }

    public Float getToxinCount() {
        return toxinCount;
    }

    public void setToxinCount(Float toxinCount) {
        this.toxinCount = toxinCount;
    }

    public Float getPollutionRate() {
        return pollutionRate;
    }

    public void setPollutionRate(Float pollutionRate) {
        this.pollutionRate = pollutionRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCheckPermissions() {
        return checkPermissions;
    }

    public void setCheckPermissions(Integer checkPermissions) {
        this.checkPermissions = checkPermissions;
    }

    public Integer getDownloadPrivileges() {
        return downloadPrivileges;
    }

    public void setDownloadPrivileges(Integer downloadPrivileges) {
        this.downloadPrivileges = downloadPrivileges;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getEnterpeople() {
        return enterpeople;
    }

    public void setEnterpeople(Integer enterpeople) {
        this.enterpeople = enterpeople;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties == null ? null : varieties.trim();
    }
}