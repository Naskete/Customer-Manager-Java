package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public interface ManagerRepository extends JpaRepository<Record, Integer> {
    @Modifying
    @Query(value = "INSERT INTO record (cusid, start, num, end) VALUES (?2, CURRENT_DATE(), ?1, ?3)", nativeQuery = true)
    @Transactional
    void checkIn(int roomId, String id, Date endTime);
}
