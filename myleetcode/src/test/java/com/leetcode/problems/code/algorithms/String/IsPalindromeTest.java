package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsPalindromeTest {
  @Test
  public void testIsPalindrome() throws Exception{
    assertFalse(IsPalindrome.isPalindrome("race a car"));
   assertTrue(IsPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    assertTrue(IsPalindrome.isPalindrome("a,"));
    assertFalse(IsPalindrome.isPalindrome("aaba"));
    assertTrue(IsPalindrome.isPalindrome("aaaa"));
    assertFalse(IsPalindrome.isPalindrome("ab"));
    assertTrue(IsPalindrome.isPalindrome("aa"));

  }

}