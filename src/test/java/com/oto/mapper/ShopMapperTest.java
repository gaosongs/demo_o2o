package com.oto.mapper;

import com.oto.BaseTest;
import com.oto.pojo.Area;
import com.oto.pojo.PersonInfo;
import com.oto.pojo.Shop;
import com.oto.pojo.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @Author gaosong
 * @Date 2021/1/9 22:22
 * @Version 1.0
 */
public class ShopMapperTest extends BaseTest {
    //声明shopmapper属性
    @Autowired
    private ShopMapper shopMapper;

    @Test
    public void testInsertShop(){
        //创建相关实体类的对象，然后通过对象.属性去赋值
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum = shopMapper.insertShop(shop);
        assertEquals(1,effectedNum);


    }
}
