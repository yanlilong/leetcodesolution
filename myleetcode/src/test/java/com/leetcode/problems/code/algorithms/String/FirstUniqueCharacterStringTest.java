package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstUniqueCharacterStringTest {

  @Test
  public void firstUniqChar() throws Exception {
    assertEquals(2,FirstUniqueCharacterString.firstUniqChar("loveleetcode"));
    assertEquals(-1,FirstUniqueCharacterString.firstUniqChar("cc"));
  }

}