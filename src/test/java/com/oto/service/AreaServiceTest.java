package com.oto.service;

import com.oto.BaseTest;
import com.oto.pojo.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author gaosong
 * @Date 2021/1/8 8:26
 * @Version 1.0
 */
public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("上海",areaList.get(0).getAreaName());
    }

}
