package com.oto.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Author gaosong
 * @Date 2021/1/6 20:05
 * @Version 1.0
 */
public class LocalAuth {
    private Long localAuthId;        //本地账号编号
    private String username;         //本地账号用户名称
    private String password;         //本地账号密码
    private Date createTime;         //本地账号创建时间
    private Date lastEditTime;        //本地账号最后修改时间
    private PersonInfo personInfo;    //用户实体对象


    //重写toString方法
    @Override
    public String toString() {
        return "LocalAuth{" +
                "localAuthId=" + localAuthId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", personInfo=" + personInfo +
                '}';
    }

    //重写equals和hashCode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalAuth localAuth = (LocalAuth) o;
        return Objects.equals(localAuthId, localAuth.localAuthId) &&
                Objects.equals(username, localAuth.username) &&
                Objects.equals(password, localAuth.password) &&
                Objects.equals(createTime, localAuth.createTime) &&
                Objects.equals(lastEditTime, localAuth.lastEditTime) &&
                Objects.equals(personInfo, localAuth.personInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localAuthId, username, password, createTime, lastEditTime, personInfo);
    }

    //全部参数的getter和settter方法
    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    //全部参数的构造方法
    public LocalAuth(Long localAuthId, String username, String password, Date createTime, Date lastEditTime, PersonInfo personInfo) {
        this.localAuthId = localAuthId;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.personInfo = personInfo;
    }

    //无参构造方法
    public LocalAuth() {
    }
}
