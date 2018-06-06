package com.leetcode.problems.code.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClimbingStairsTest {
  ClimbingStairs climb=new ClimbingStairs();

  @Test
  public void climbStaires() throws Exception {
    assertEquals(1+1,climb.climbStaires(2));
    assertEquals(3,climb.climbStaires(3));
  }

  @Test
  public void climb_Stairs() throws Exception {
  }

}