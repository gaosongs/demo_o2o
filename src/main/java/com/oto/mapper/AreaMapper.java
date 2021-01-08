package com.oto.mapper;

import com.oto.pojo.Area;

import java.util.List;

/**
 * @Author gaosong
 * @Date 2021/1/7 21:02
 * @Version 1.0
 */
public interface AreaMapper {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();
}
