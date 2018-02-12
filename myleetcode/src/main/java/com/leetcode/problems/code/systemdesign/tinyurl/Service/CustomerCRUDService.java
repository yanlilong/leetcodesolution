package com.leetcode.problems.code.systemdesign.tinyurl.Service;


import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.CustomerRepository;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Customer;

public class CustomerCRUDService {
  private static final Logger logger = Logger.getLogger(CustomerCRUDService.class);
  @Autowired
  CustomerRepository customerRepository;

  public Customer getCustomer(String email){
    Customer customer=customerRepository.findByEmail(email);
    return customer;

    }

  }


