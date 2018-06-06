package com.leetcode.problems.code.systemdesign.tinyurl.exception.runtime;

import org.apache.log4j.Logger;

public class LongURLNotFoundException extends RuntimeException{
  Logger logger = Logger.getLogger(LongURLNotFoundException.class);

  public LongURLNotFoundException(final String message) {
    super(message);
  }

  public LongURLNotFoundException(final String message,final Exception cause){
    super(message,cause);
  }

}
