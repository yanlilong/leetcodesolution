package com.leetcode.problems.code.systemdesign.tinyurl.exception.runtime;

import com.leetcode.problems.code.systemdesign.tinyurl.exception.TinyURLException;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletResponse;


public class ShortURLNotFoundException extends RuntimeException {
  Logger logger = Logger.getLogger(ShortURLNotFoundException.class);

  public ShortURLNotFoundException(final String message) {
    super(message);
  }

  public ShortURLNotFoundException(final String message,final Exception cause){
    super(message,cause);
  }

}
