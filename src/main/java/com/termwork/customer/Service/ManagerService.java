package com.termwork.customer.Service;

import com.termwork.customer.Dao.Room;
import com.termwork.customer.Mapper.CustomerRepository;
import com.termwork.customer.Mapper.ManagerRepository;
import com.termwork.customer.Mapper.RoomRepository;
import com.termwork.customer.Util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private CustomerRepository customerRepository;


    public boolean checkIn(int roomId, String id, String name, String phone, String end) {
        Date endTime = Util.toDate(end);
        Room room = roomRepository.getRoomByRoomId(roomId);
        // 已经有人入住
        if(room.isStatus()) {
            return false;
        }
        try {
            managerRepository.checkIn(roomId, id, endTime);
            customerRepository.customerRegister(id, name, phone);
            roomRepository.updateStatus(roomId, true);
        } catch (Exception e){
            throw e;
        }
        return true;
    }

    public double price(int roomId, String start, String end){
        Room room = roomRepository.getRoomByRoomId(roomId);
        long day = Util.getDays(start, end);
        return room.getPrice()*day;
    }

    public boolean checkOut(int roomId, String id){
        roomRepository.updateStatus(roomId, false);
        roomRepository.increase(roomId);
        customerRepository.increase(id);
        return true;
    }
}
