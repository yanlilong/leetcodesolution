package com.leetcode.problems.code.systemdesign.tinyurl.Exception;

import java.lang.RuntimeException;
import org.apache.log4j.Logger;

public class CustomerNotFoundException extends RuntimeException {

  Logger logger = Logger.getLogger(CustomerNotFoundException.class);

  public CustomerNotFoundException(String exception) {
    super(exception);

  }


}
