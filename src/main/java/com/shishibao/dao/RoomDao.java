package com.shishibao.dao;

import com.shishibao.entity.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomDao {

    public List<Room> getRoomList();
}
