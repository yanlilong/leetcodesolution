package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class JudgeRouteCircle657Test {

  @Test
  public void judgeCircle() throws Exception {
    assertTrue(JudgeRouteCircle657.judgeCircle("UD"));
    assertFalse(JudgeRouteCircle657.judgeCircle("LL"));
  }

}