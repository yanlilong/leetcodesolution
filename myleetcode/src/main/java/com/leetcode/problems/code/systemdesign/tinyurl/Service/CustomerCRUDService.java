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

  public List<Customer> getCustomer(String email){
    List<Customer> customerList=customerRepository.findByEmail(email);
    return customerList;

    }

  }


