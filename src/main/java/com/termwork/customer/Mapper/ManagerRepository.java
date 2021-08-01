package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ManagerRepository extends JpaRepository<Record, Integer> {
    @Modifying
    @Query(value = "INSERT INTO record (cusid, date, num) VALUES (?2, CURRENT_TIMESTAMP(), ?1)", nativeQuery = true)
    @Transactional
    void checkIn(int roomId, String id);
}
