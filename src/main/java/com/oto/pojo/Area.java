package com.oto.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Author gaosong
 * @Date 2021/1/6 19:06
 * @Version 1.0
 */
public class Area {

    private Integer areaId;          //区域id
    private String areaName;         //区域名称
    private Integer priority;        //权重
    private Date createTime;         //创建时间
    private Date lastEditTime;       //更新时间


    //重写toString()方法
    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    //重写equals和hashCode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(areaId, area.areaId) &&
                Objects.equals(areaName, area.areaName) &&
                Objects.equals(priority, area.priority) &&
                Objects.equals(createTime, area.createTime) &&
                Objects.equals(lastEditTime, area.lastEditTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaId, areaName, priority, createTime, lastEditTime);
    }

    //全部参数的getter和setter方法
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    //全部参数的构造方法
    public Area(Integer areaId, String areaName, Integer priority, Date createTime, Date lastEditTime) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.priority = priority;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }

    //无参构造方法
    public Area() {
    }
}
