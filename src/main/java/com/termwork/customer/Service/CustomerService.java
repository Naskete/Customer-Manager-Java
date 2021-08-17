package com.termwork.customer.Service;

import com.termwork.customer.DTO.CustomerInfo;
import com.termwork.customer.Dao.Customer;
import com.termwork.customer.Dao.Record;
import com.termwork.customer.Mapper.CustomerRepository;
import com.termwork.customer.Mapper.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RecordRepository recordRepository;

    public Object getCustomerInfo(String id){
        Customer customer = customerRepository.getCustomerById(id);
        CustomerInfo info = new CustomerInfo();
        info.setId(customer.getId());
        info.setName(customer.getName());
        info.setPhone(customer.getPhone());
        info.setCount(customer.getCount());
        return info;
    }

    public boolean deleteCustomer(String id){
        Customer customer = customerRepository.getCustomerById(id);
        if(customer==null)
            return false;
        customerRepository.deleteCustomerInfo(id);
        return true;
    }

}
