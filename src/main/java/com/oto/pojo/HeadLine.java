package com.oto.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Author gaosong
 * @Date 2021/1/6 20:56
 * @头条实体类
 * @Version 1.0
 */

public class HeadLine {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    //0-不可用  1-可用
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

    @Override
    public String toString() {
        return "HeadLine{" +
                "lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", lineLink='" + lineLink + '\'' +
                ", lineImg='" + lineImg + '\'' +
                ", priority=" + priority +
                ", enableStatus=" + enableStatus +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadLine headLine = (HeadLine) o;
        return Objects.equals(lineId, headLine.lineId) &&
                Objects.equals(lineName, headLine.lineName) &&
                Objects.equals(lineLink, headLine.lineLink) &&
                Objects.equals(lineImg, headLine.lineImg) &&
                Objects.equals(priority, headLine.priority) &&
                Objects.equals(enableStatus, headLine.enableStatus) &&
                Objects.equals(createTime, headLine.createTime) &&
                Objects.equals(lastEditTime, headLine.lastEditTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId, lineName, lineLink, lineImg, priority, enableStatus, createTime, lastEditTime);
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return lineImg;
    }

    public void setLineImg(String lineImg) {
        this.lineImg = lineImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
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

    public HeadLine(Long lineId, String lineName, String lineLink, String lineImg, Integer priority, Integer enableStatus, Date createTime, Date lastEditTime) {
        this.lineId = lineId;
        this.lineName = lineName;
        this.lineLink = lineLink;
        this.lineImg = lineImg;
        this.priority = priority;
        this.enableStatus = enableStatus;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }

    public HeadLine() {
    }
}
