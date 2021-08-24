package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    @Query("SELECT s FROM Record s WHERE s.cusID = ?1")
    @Transactional
    List<Record> getRecordByCusID(String id);
}
