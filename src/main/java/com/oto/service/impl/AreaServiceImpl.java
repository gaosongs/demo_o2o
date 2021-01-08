package com.oto.service.impl;

import com.oto.mapper.AreaMapper;
import com.oto.pojo.Area;
import com.oto.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author gaosong
 * @Date 2021/1/8 8:22
 * @Version 1.0
 */
@Service
public class AreaServiceImpl implements AreaService {
    //声明mapper属性
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public List<Area> getAreaList() {
        return areaMapper.queryArea() ;
    }
}
