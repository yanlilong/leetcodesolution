package com.leetcode.problems.code.systemdesign.tinyurl.repository;

import org.springframework.data.repository.CrudRepository;
import  com.leetcode.problems.code.systemdesign.tinyurl.domain.Customer;
import java.util.List;

public interface CustomerRepository extends CrudRepository <Customer,Long>{
  public List<Customer> findByName(String name);
  public Customer findByEmail(String email);
  public List<Customer> findByDate(String date);

}