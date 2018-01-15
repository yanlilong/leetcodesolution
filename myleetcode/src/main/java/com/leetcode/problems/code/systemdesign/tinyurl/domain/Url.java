package com.leetcode.problems.code.systemdesign.tinyurl.domain;

import java.io.Serializable;

public class Url implements Identifiable {

  private Long id;
  private String longURL;
  private String shortURL;

  public String getLongURL() {
    return longURL;
  }




  public String getShortURL() {
    return shortURL;
  }

  public void setShortURL(String shortURL) {
    this.shortURL = shortURL;
  }

  public void setLongURL(String longURL) {
    this.longURL = longURL;
  }

  public void setId(Long id) {
    id = id;
  }

  public Long getId() {
    return id;
  }
}
