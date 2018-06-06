package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class DetectCapitalTest {

  @Test
  public void detectCap() throws Exception {
    assertTrue(DetectCapital.detectCap("USA"));
    assertTrue(DetectCapital.detectCap("leetcode"));
    assertTrue(DetectCapital.detectCap("Google"));
    assertFalse(DetectCapital.detectCap("flaG"));
    assertFalse(DetectCapital.detectCap("GlaG"));
  }

}