package com.shishibao.service.impl;

import com.alibaba.fastjson.JSON;
import com.shishibao.controller.HomepageController;
import com.shishibao.dao.RoomDao;
import com.shishibao.entity.Room;
import com.shishibao.service.RoomService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    private Logger logger = Logger.getLogger(RoomServiceImpl.class);

    @Autowired
    private RoomDao roomDao;

    public List<Room> getRoomList(){
        logger.info("RoomService");
        logger.info(roomDao.getRoomList().size());
        return roomDao.getRoomList();
    }
}
