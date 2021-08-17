package com.termwork.customer.Service;

import com.termwork.customer.Dao.Room;
import com.termwork.customer.Mapper.CustomerRepository;
import com.termwork.customer.Mapper.ManagerRepository;
import com.termwork.customer.Mapper.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Savepoint;


@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public boolean checkIn(int roomId, String id, String name, String phone){
        Room room = roomRepository.getRoomByRoomId(roomId);
        // 已经有人入住
        if(room.isStatus()) {
            return false;
        }
        try {
            managerRepository.checkIn(roomId, id);
            customerRepository.customerRegister(id, name, phone);
            roomRepository.updateStatus(roomId, true);
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public double price(int roomId){
        Room room = roomRepository.getRoomByRoomId(roomId);
        System.out.println(room);

        return room.getPrice();
    }

    public Object checkOut(){
        return null;
    }
}
