package com.oto.mapper;

import com.oto.BaseTest;
import com.oto.pojo.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author gaosong
 * @Date 2021/1/7 21:20
 * @Version 1.0
 */
public class AreaMapperTest extends BaseTest {
    //引入AreaMapper属性
    @Autowired
    private AreaMapper areaMapper;
@Test
    public void testQueryArea(){
        List<Area> areaList = areaMapper.queryArea();
        assertEquals(2,areaList.size());
    }

}
