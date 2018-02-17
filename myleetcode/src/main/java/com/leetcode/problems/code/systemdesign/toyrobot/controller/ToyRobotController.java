package com.leetcode.problems.code.systemdesign.toyrobot.controller;

import com.leetcode.problems.code.systemdesign.tinyurl.controller.CustomerController;
import com.leetcode.problems.code.systemdesign.tinyurl.domain.Customer;
import com.leetcode.problems.code.systemdesign.tinyurl.repository.CustomerRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ToyRobotController {

  private static final Logger logger = Logger.getLogger(ToyRobotController.class);
  //@Autowired
  //private CustomerRepository customerRepository;


  //@RequestMapping(path = "/customerdetails/{email}/", produces = "application/json;charset=UTF-8")
  @RequestMapping(path = "api/v1/toy-robot/{commands}/",produces = {"text/plain"})

  @ResponseBody
  public String getRobotPlace(@PathVariable String commands) {
    logger.info("commands=" + commands);

    return commands;

  }

}


