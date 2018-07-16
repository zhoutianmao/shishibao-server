package com.shishibao.controller;

import com.alibaba.fastjson.JSON;
import com.shishibao.base.BaseDTO;
import com.shishibao.entity.Room;
import com.shishibao.service.RoomService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/home")
public class HomepageController {

    private Logger logger = Logger.getLogger(HomepageController.class);

    @Autowired
    private RoomService roomService;

    private BaseDTO baseDTO = new BaseDTO();

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public BaseDTO getRoomList(){
        logger.info("请求主页列表。");
        List<Room> rooms = roomService.getRoomList();
        baseDTO.setRetCode("00000000");
        baseDTO.setRetMsg("成功");
        baseDTO.setResults(rooms);

        logger.info("请求结果" + JSON.toJSONString(baseDTO));

        return baseDTO;
    }


}
