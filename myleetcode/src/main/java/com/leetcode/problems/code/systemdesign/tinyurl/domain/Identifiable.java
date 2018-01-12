package com.leetcode.problems.code.systemdesign.tinyurl.domain;


public interface Identifiable extends org.springframework.hateoas.Identifiable {

  public void setId(Long id);
}
