package com.termwork.customer.Service;

import com.termwork.customer.Dao.Customer;
import com.termwork.customer.Mapper.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Object getCustomerInfo(){
        return null;
    }

    public Object deleteCustomer(){
        return null;
    }

}
