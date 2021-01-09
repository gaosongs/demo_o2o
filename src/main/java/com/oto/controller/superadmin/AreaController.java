package com.oto.controller.superadmin;

import com.oto.pojo.Area;
import com.oto.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author gaosong
 * @Date 2021/1/8 10:05
 * @Version 1.0
 */
@Controller
@RequestMapping("/superAdmin")
public class AreaController {
    Logger logger = LoggerFactory.getLogger(AreaController.class);
    //声明service层属性
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object> listArea(){
        logger.info("====start====");
        long startTime = System.currentTimeMillis();
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> list = new ArrayList<Area>();

        try {
            list = areaService.getAreaList();
            modelMap.put("rows",list);
            modelMap.put("total",list.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
        }finally {
            logger.error("test error!!!");
            long endTime = System.currentTimeMillis();
            logger.info("=====end======");
            logger.debug("costTime:[{}ms]",endTime-startTime);
            return modelMap;
        }
        


    }
}
