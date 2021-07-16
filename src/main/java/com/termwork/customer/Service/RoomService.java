package com.termwork.customer.Service;

import com.termwork.customer.Dao.Room;
import com.termwork.customer.Mapper.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getSingleRoom(){
        return roomRepository.getSingleRoom();
    }

    public List<Room> getTwinRoom(){
        return roomRepository.getTwinRoom();
    }

    public Object getRoomInfo(int roomId){
        return null;
    }

    public Object addRoom(int roomId, int type, double price){
        return null;
    }

    public Object deleteRoom(int roomId){
        return null;
    }

}
