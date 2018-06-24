package com.leetcode.problems.code.systemdesign.tinyurl.exception;

import com.leetcode.problems.code.systemdesign.tinyurl.exception.runtime.ShortURLNotFoundException;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class URLNotFoundException extends TinyURLException {

  Logger logger = Logger.getLogger(ShortURLNotFoundException.class);

  public URLNotFoundException(final String message) {
    super(message);
  }

  public URLNotFoundException(final String message,final Exception cause){
    super(message,cause);
  }

  @Override
  protected int getStatus() {
    return HttpServletResponse.SC_NOT_FOUND;
  }

}
