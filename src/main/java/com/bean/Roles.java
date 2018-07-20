package com.bean;

public class Roles {
    /** 角色表主键*/
    private Integer rid;

    /** 角色*/
    private String role;

    /** 角色中文名*/
    private String chrole;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getChrole() {
        return chrole;
    }

    public void setChrole(String chrole) {
        this.chrole = chrole == null ? null : chrole.trim();
    }
}