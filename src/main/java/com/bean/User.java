package com.bean;

import java.util.Date;

public class User {
    /** 主键*/
    private Integer id;

    /** 客户-账号/其他-登录名*/
    private String loginName;

    /** 客户-真实姓名/其他-用户名*/
    private String username;

    /** 身份证*/
    private String idcard;

    /** 邮箱*/
    private String email;

    /** 电话*/
    private String phone;

    /** 客户--申请时间*/
    private Date applicationTime;

    /** */
    private Integer applicationDirection;

    /** 客户--审核状态0未审核 1通过 2驳回*/
    private Integer checkStatus;

    /** 状态,1为启用，0为未启用*/
    private Integer state;

    /** 创建时间*/
    private Date createTime;

    /** 是否删除0 未删除 1已删除*/
    private Integer isdel;

    /** 客户--权限1水果2谷物3油料4坚果5香辛6饲料7全部*/
    private String customerPower;

    /** */
    private Integer ispass;

    /** 密码*/
    private String password;

    /** 角色：1系统管理员，2信息管理员，3客户管理员，4信息权限管理员，5客户*/
    private Integer role;

    /** 用户--创建人id*/
    private Integer createpeople;

    /** 信息管理员，品类权限*/
    private String category;

    /** 信息管理员，地区权限*/
    private String area;

    /** 信息管理员，开始时间*/
    private Date starttime;

    /** 信息管理员，结束时间*/
    private Date endtime;

    /** 客户-所在单位名称*/
    private String company;

    /** 客户-单位地址*/
    private String address;

    /** 区分信息管理员是不是注册来的0是非注册1是注册*/
    private Integer msgflag;

    /** 性别*/
    private Integer sex;

    /** 出生日期*/
    private Date birthday;

    /** 证件类型*/
    private Integer certificatetype;

    /** 民族*/
    private String nation;

    /** 国别*/
    private String country;

    /** 系所*/
    private String depart;

    /** 职称*/
    private Integer jobtitle;

    /** 职务*/
    private Integer post;

    /** 省份*/
    private String province;

    /** 城市*/
    private String city;

    /** 邮编*/
    private String zipcode;

    /** 毕业院校*/
    private String graduatedschool;

    /** 最高学位*/
    private String educational;

    /** 授予国家及地区*/
    private String grantarea;

    /** 授予时间*/
    private String grantyear;

    /** 授予学校*/
    private String grantschool;

    /** 院士*/
    private String academician;

    /** 导师*/
    private String tutor;

    /** 备用邮箱*/
    private String spareemail;

    /** 办公电话*/
    private String officephone;

    /** 家庭电话*/
    private String homephone;

    /** 传真*/
    private String fax;

    /** 个人网页*/
    private String personalweb;

    /** 项目批准号1*/
    private String approvalnumber1;

    /** 项目批准号2*/
    private String approvalnumber2;

    /** 项目批准号3*/
    private String approvalnumber3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public Integer getApplicationDirection() {
        return applicationDirection;
    }

    public void setApplicationDirection(Integer applicationDirection) {
        this.applicationDirection = applicationDirection;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public String getCustomerPower() {
        return customerPower;
    }

    public void setCustomerPower(String customerPower) {
        this.customerPower = customerPower == null ? null : customerPower.trim();
    }

    public Integer getIspass() {
        return ispass;
    }

    public void setIspass(Integer ispass) {
        this.ispass = ispass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getCreatepeople() {
        return createpeople;
    }

    public void setCreatepeople(Integer createpeople) {
        this.createpeople = createpeople;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getMsgflag() {
        return msgflag;
    }

    public void setMsgflag(Integer msgflag) {
        this.msgflag = msgflag;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(Integer certificatetype) {
        this.certificatetype = certificatetype;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public Integer getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(Integer jobtitle) {
        this.jobtitle = jobtitle;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getGraduatedschool() {
        return graduatedschool;
    }

    public void setGraduatedschool(String graduatedschool) {
        this.graduatedschool = graduatedschool == null ? null : graduatedschool.trim();
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational == null ? null : educational.trim();
    }

    public String getGrantarea() {
        return grantarea;
    }

    public void setGrantarea(String grantarea) {
        this.grantarea = grantarea == null ? null : grantarea.trim();
    }

    public String getGrantyear() {
        return grantyear;
    }

    public void setGrantyear(String grantyear) {
        this.grantyear = grantyear == null ? null : grantyear.trim();
    }

    public String getGrantschool() {
        return grantschool;
    }

    public void setGrantschool(String grantschool) {
        this.grantschool = grantschool == null ? null : grantschool.trim();
    }

    public String getAcademician() {
        return academician;
    }

    public void setAcademician(String academician) {
        this.academician = academician == null ? null : academician.trim();
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor == null ? null : tutor.trim();
    }

    public String getSpareemail() {
        return spareemail;
    }

    public void setSpareemail(String spareemail) {
        this.spareemail = spareemail == null ? null : spareemail.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone == null ? null : homephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getPersonalweb() {
        return personalweb;
    }

    public void setPersonalweb(String personalweb) {
        this.personalweb = personalweb == null ? null : personalweb.trim();
    }

    public String getApprovalnumber1() {
        return approvalnumber1;
    }

    public void setApprovalnumber1(String approvalnumber1) {
        this.approvalnumber1 = approvalnumber1 == null ? null : approvalnumber1.trim();
    }

    public String getApprovalnumber2() {
        return approvalnumber2;
    }

    public void setApprovalnumber2(String approvalnumber2) {
        this.approvalnumber2 = approvalnumber2 == null ? null : approvalnumber2.trim();
    }

    public String getApprovalnumber3() {
        return approvalnumber3;
    }

    public void setApprovalnumber3(String approvalnumber3) {
        this.approvalnumber3 = approvalnumber3 == null ? null : approvalnumber3.trim();
    }
}