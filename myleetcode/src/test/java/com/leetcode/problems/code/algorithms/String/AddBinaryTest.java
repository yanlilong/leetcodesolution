package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinaryTest {

  @Test
  public void addBinary() throws Exception {
    assertEquals("00",AddBinary.addBinary("00","00"));
    assertEquals("11",AddBinary.addBinary("11","00"));
    assertEquals("110",AddBinary.addBinary("11","11"));
    assertEquals("1000",AddBinary.addBinary("111","1"));
  }

}