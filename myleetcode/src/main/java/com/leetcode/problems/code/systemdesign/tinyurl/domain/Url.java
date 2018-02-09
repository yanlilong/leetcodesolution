package com.leetcode.problems.code.systemdesign.tinyurl.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * public class Url implements Identifiable {
 *
 * private Long id; private String longURL; private String shortURL;
 *
 * public String getLongURL() { return longURL; }
 *
 *
 *
 *
 * public String getShortURL() { return shortURL; }
 *
 * public void setShortURL(String shortURL) { this.shortURL = shortURL; }
 *
 * public void setLongURL(String longURL) { this.longURL = longURL; }
 *
 * public void setId(Long id) { id = id; }
 *
 * public Long getId() { return id; }
 *
 * }
 */
@Entity
@Table(name = "url")

public class Url {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Integer id;
  private String longURL;
  private String shortURL;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLongURL() {
    return longURL;
  }

  public void setLongURL(String longURL) {
    this.longURL = longURL;
  }

  public String getShortURL() {
    return shortURL;
  }

  public void setShortURL(String shortURL) {
    this.shortURL = shortURL;
  }
}
