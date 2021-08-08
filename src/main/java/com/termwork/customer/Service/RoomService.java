package com.termwork.customer.Service;

import com.termwork.customer.Dao.Room;
import com.termwork.customer.Mapper.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        return roomRepository.getRoomByRoomId(roomId);
    }

    public boolean addRoom(int roomId, int type, double price){
        try{
            roomRepository.addRoom(roomId,type,price);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean deleteRoom(int roomId){
        roomRepository.deleteRoom(roomId);
        return true;
    }

}
