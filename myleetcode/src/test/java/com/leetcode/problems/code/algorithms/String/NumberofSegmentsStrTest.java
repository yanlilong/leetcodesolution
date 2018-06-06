package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberofSegmentsStrTest {

  @Test
  public void countSegments() throws Exception {
    /** assertEquals(2,NumberofSegmentsStr.countSegments("the world,   "));
    assertEquals(5,NumberofSegmentsStr.countSegments("Hello, my name is John"));
    assertEquals(13,NumberofSegmentsStr.countSegments("Of all the gin joints in all the towns in all the world,   "));
    assertEquals(6,NumberofSegmentsStr.countSegments(", , , ,        a, eaefa"));*/
  }

  @Test
  public void numberSeg() throws Exception {
    assertEquals(2,NumberofSegmentsStr.numberSeg("the world,   "));
    assertEquals(5,NumberofSegmentsStr.numberSeg("Hello, my name is John"));
    assertEquals(13,NumberofSegmentsStr.numberSeg("Of all the gin joints in all the towns in all the world,   "));
    assertEquals(6,NumberofSegmentsStr.numberSeg(", , , ,        a, eaefa"));
  }

}