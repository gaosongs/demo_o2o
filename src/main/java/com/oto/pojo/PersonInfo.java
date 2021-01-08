package com.oto.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Author gaosong
 * @Date 2021/1/6 12:25
 * @Version 1.0
 */
public class PersonInfo {
    private Long userId;              //用户Id
    private String name;              //用户昵称
    private String profileImg;        //用户头像
    private String email;             //用户邮箱
    private String gender;            //用户性别
    private Integer enableStatus;     //用户状态
    //1.顾客 2.店家 3.超级管理员
    private Integer userType;         //用户类别
    private Date createTime;          //创建时间
    private Date lastEditTime;        //最近一次修改时间


    //重写toString方法
    @Override
    public String toString() {
        return "PersonInfo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", profileImg='" + profileImg + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", enableStatus=" + enableStatus +
                ", userType=" + userType +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    //重写hashCode和equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInfo that = (PersonInfo) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(profileImg, that.profileImg) &&
                Objects.equals(email, that.email) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(enableStatus, that.enableStatus) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(lastEditTime, that.lastEditTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, profileImg, email, gender, enableStatus, userType, createTime, lastEditTime);
    }

    //全部属性的getter和setter方法
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    //无参构造方法
    public PersonInfo() {
    }

    //全部参数构造方法
    public PersonInfo(Long userId, String name, String profileImg, String email, String gender, Integer enableStatus, Integer userType, Date createTime, Date lastEditTime) {
        this.userId = userId;
        this.name = name;
        this.profileImg = profileImg;
        this.email = email;
        this.gender = gender;
        this.enableStatus = enableStatus;
        this.userType = userType;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }
}
