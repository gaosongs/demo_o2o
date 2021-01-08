package com.oto.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Author gaosong
 * @Date 2021/1/6 20:00
 * @Version 1.0
 */
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;

    //重写toString()方法
    @Override
    public String toString() {
        return "WechatAuth{" +
                "wechatAuthId=" + wechatAuthId +
                ", openId='" + openId + '\'' +
                ", createTime=" + createTime +
                ", personInfo=" + personInfo +
                '}';
    }

    //重写equals()和hashCode()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WechatAuth that = (WechatAuth) o;
        return Objects.equals(wechatAuthId, that.wechatAuthId) &&
                Objects.equals(openId, that.openId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(personInfo, that.personInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wechatAuthId, openId, createTime, personInfo);
    }

    //全部参数的getter和setter方法
    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    //全部参数的构造方法
    public WechatAuth(Long wechatAuthId, String openId, Date createTime, PersonInfo personInfo) {
        this.wechatAuthId = wechatAuthId;
        this.openId = openId;
        this.createTime = createTime;
        this.personInfo = personInfo;
    }

    //无参构造方法
    public WechatAuth() {
    }
}
