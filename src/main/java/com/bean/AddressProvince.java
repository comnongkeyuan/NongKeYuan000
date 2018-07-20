package com.bean;

public class AddressProvince {
    /** 主键*/
    private Integer id;

    /** 省份编码*/
    private String code;

    /** 省份名称*/
    private String name;

    /** */
    private String chinaname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getChinaname() {
        return chinaname;
    }

    public void setChinaname(String chinaname) {
        this.chinaname = chinaname == null ? null : chinaname.trim();
    }
}