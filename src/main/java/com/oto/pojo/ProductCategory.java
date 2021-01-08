package com.oto.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Author gaosong
 * @Date 2021/1/7 8:30
 * @Version 1.0
 * 商品类别实体类
 */
public class ProductCategory {
    private Long productCategoryId;
    private Long shopId;
    private String productCategoryName;
    private Integer priority;
    private Date createTime;

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategoryId=" + productCategoryId +
                ", shopId=" + shopId +
                ", productCategoryName='" + productCategoryName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(productCategoryId, that.productCategoryId) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(productCategoryName, that.productCategoryName) &&
                Objects.equals(priority, that.priority) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategoryId, shopId, productCategoryName, priority, createTime);
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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

    public ProductCategory(Long productCategoryId, Long shopId, String productCategoryName, Integer priority, Date createTime) {
        this.productCategoryId = productCategoryId;
        this.shopId = shopId;
        this.productCategoryName = productCategoryName;
        this.priority = priority;
        this.createTime = createTime;
    }

    //无参构造方法
    public ProductCategory() {
    }
}
