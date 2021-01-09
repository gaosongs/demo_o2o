package com.oto.mapper;

import com.oto.pojo.Shop;

/**
 * @Author gaosong
 * @Date 2021/1/9 21:54
 * @Version 1.0
 */
public interface ShopMapper {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);
}
