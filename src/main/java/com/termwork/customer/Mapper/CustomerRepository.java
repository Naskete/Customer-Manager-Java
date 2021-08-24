package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Query("SELECT user FROM Customer user WHERE user.id = ?1")
    Customer getCustomerById(String id);

    @Modifying
    @Query("DELETE FROM Customer WHERE id = ?1")
    @Transactional
    void deleteCustomerInfo(String id);

    @Modifying
    @Query(value = "INSERT INTO customer(id, count, name, phone) VALUES (?1, 0, ?2, ?3) ON  DUPLICATE KEY UPDATE phone = ?3", nativeQuery = true)
    @Transactional
    void customerRegister(String id, String name, String phone);

    @Modifying
    @Query(value = "UPDATE customer SET count = (SELECT it.count FROM (SELECT count FROM customer WHERE id = ?1) AS it)+1 WHERE id = ?1", nativeQuery = true)
    @Transactional
    void increase(String id);
}
