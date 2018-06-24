package com.leetcode.problems.code.systemdesign.tinyurl.exception;


public abstract class TinyURLException extends Exception {

  public TinyURLException(final String message){
    super(message);
  }

  public TinyURLException(final String message,final Exception cause){
    super(message,cause);
  }

  protected abstract int getStatus();

}
