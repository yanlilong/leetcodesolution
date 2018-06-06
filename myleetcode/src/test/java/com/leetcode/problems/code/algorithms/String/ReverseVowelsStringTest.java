package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseVowelsStringTest {

  @Test
  public void reverseVowels() throws Exception {
    assertEquals("Hello",ReverseVowelsString.reverseVowels("Holle"));
    assertEquals("leotcede",ReverseVowelsString.reverseVowels("leetcode"));
    assertEquals("ia",ReverseVowelsString.reverseVowels("ai"));
    assertEquals("iA",ReverseVowelsString.reverseVowels("Ai"));
  }

}