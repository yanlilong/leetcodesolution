package com.leetcode.problems.code.algorithms;

import static org.junit.Assert.*;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;

public class ReverseIntTest {

  @Test
  public void reverse() throws Exception {
    assertEquals(Integer.valueOf(ReverseInt.reverse(123)),Integer.valueOf(321));
    assertEquals(Integer.valueOf(ReverseInt.reverse(210)),Integer.valueOf(12));
    assertEquals(Integer.valueOf(ReverseInt.reverse(-2100)),Integer.valueOf(-12));
    assertEquals(Integer.valueOf(ReverseInt.reverse(-1)),Integer.valueOf(-1));
    assertEquals(Integer.valueOf(ReverseInt.reverse(0)),Integer.valueOf(0));
    assertEquals(Integer.valueOf(ReverseInt.reverse(-10)),Integer.valueOf(-1));
    assertEquals(Integer.valueOf(ReverseInt.reverse(10)),Integer.valueOf(1));
    assertEquals(Integer.valueOf(ReverseInt.reverse(9646423251L)),Integer.valueOf(1523246469));
    assertEquals(Integer.valueOf(ReverseInt.reverse(9646423251000L)),Integer.valueOf(1523246469));
  }

}