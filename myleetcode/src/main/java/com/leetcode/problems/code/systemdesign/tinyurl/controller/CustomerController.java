package com.leetcode.problems.code.systemdesign.tinyurl.controller;

import com.leetcode.problems.code.systemdesign.tinyurl.Service.CustomerCRUDService;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Customer;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.CustomerRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
public class CustomerController {
  private static final Logger logger = Logger.getLogger(CustomerController.class);
  @Autowired
  private CustomerCRUDService customerCRUDService;
  @Autowired
  private CustomerRepository customerRepository;

  @RequestMapping(value="/customerdetails",consumes="application/json")
  @ResponseBody
  public Customer getCustomerDetails(int i){
  return customerRepository.findOne(Integer.valueOf(i).longValue());

  }

}
