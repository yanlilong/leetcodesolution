package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

  @Test
  public void reverse() throws Exception {
    assertEquals("123",ReverseString.reverse("321"));
    assertEquals("1",ReverseString.reverse("1"));
    assertEquals("",ReverseString.reverse(""));
  }

}