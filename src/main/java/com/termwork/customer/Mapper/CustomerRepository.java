package com.termwork.customer.Mapper;

import com.termwork.customer.Dao.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Modifying
    @Query("SELECT user FROM Customer user WHERE user.id = ?1")
    Customer getCustomerById(String id);

    @Modifying
    @Query("DELETE FROM Customer WHERE id = ?1")
    boolean deleteCustomerInfo(String id);
}
