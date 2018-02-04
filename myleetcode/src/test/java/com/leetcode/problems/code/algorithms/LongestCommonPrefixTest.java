package com.leetcode.problems.code.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefixTest {

  @Test
  public void longestCommonPrefix() throws Exception {

    String[] strs = {"leetcode", "leetabcd",
        "leet"};// short form is allowed only at variable initialization
    String prefix = LongestCommonPrefix.longestCommonPrefix(strs);
    //assertEquals(prefix, "leet");
    assertEquals(LongestCommonPrefix.longestCommonPrefix(null), "");
  }

}