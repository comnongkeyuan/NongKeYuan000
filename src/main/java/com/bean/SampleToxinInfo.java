package com.bean;

public class SampleToxinInfo {
    /** 毒素表主键*/
    private Integer id;

    /** 毒素种类11种*/
    private String toxinType;

    /** */
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToxinType() {
        return toxinType;
    }

    public void setToxinType(String toxinType) {
        this.toxinType = toxinType == null ? null : toxinType.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}