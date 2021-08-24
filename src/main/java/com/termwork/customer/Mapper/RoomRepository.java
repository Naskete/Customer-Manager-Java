package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

    @Modifying
    @Query("SELECT s FROM Room s WHERE s.type = 0")
    List<Room> getSingleRoom();


    @Modifying
    @Query("SELECT s FROM  Room s WHERE s.type = 1")
    List<Room> getTwinRoom();


    @Query("SELECT s FROM Room s WHERE s.roomId = ?1")
    Room getRoomByRoomId(int roomId);

    @Modifying
    @Query(value = "INSERT INTO room(room_id, number, price, status, type) VALUES (?1, 0, ?3, false, ?2)", nativeQuery = true)
    @Transactional
    void addRoom(@Param("roomId") int roomId, @Param("type") int type, @Param("price") double price);

    @Modifying
    @Query("DELETE FROM Room WHERE roomId = ?1 ")
    @Transactional
    void deleteRoom(int roomId);

    @Modifying
    @Query("UPDATE Room SET status=?2 WHERE roomId=?1")
    @Transactional
    void updateStatus(int roomId, boolean status);

    @Modifying
    @Query(value = "UPDATE room SET number = (SELECT it.number FROM (SELECT number FROM room WHERE room_id = ?1) AS it)+1 WHERE room_id = ?1", nativeQuery = true)
    @Transactional
    void increase(int roomId);
}