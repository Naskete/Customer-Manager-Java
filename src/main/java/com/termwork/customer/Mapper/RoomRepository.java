package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Room;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    @Modifying
    @Query("SELECT s FROM Room s WHERE s.type = 0")
    List<Room> getSingleRoom();

    @Modifying
    @Query("SELECT s FROM  Room s WHERE s.type = 1")
    List<Room> getTwinRoom();

    @Modifying
    @Query("SELECT s FROM Room s WHERE s.roomId = ?1")
    Room getRoomByRoomId(int roomId);

    @Insert("INSERT INTO room(room_id, number, price, status, type) " +
            "VALUES(#{roomId}, 0, #{price}, false, #{type})")
    boolean addRoom(@Param("roomId") int roomId, @Param("type") int type, @Param("price") double price);

    @Modifying
    @Query("DELETE FROM Room WHERE roomId = ?1 ")
    boolean deleteRoom(int roomId);
}