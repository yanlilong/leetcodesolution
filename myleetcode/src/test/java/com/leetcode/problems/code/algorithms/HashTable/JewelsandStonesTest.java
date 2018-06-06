package com.leetcode.problems.code.algorithms.HashTable;

import static org.junit.Assert.*;

import org.junit.Test;

public class JewelsandStonesTest {

  @Test
  public void numJewelsInStones() throws Exception {
    assertEquals(3,JewelsandStones.numJewelsInStones2("aA","aAAsss"));
    assertEquals(0,JewelsandStones.numJewelsInStones2("","aBSS"));
    assertEquals(3,JewelsandStones.numJewelsInStones2("Az","zzz"));
  }

}