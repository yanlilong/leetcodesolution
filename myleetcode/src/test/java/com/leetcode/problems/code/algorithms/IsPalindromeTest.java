package com.leetcode.problems.code.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;

public class IsPalindromeTest {
  @Test
  public void IsPalindrome() throws Exception {
    assertEquals(true,IsPalindrome.isPalind(101));
    assertEquals(true,IsPalindrome.isPalind(2));
    assertEquals(true,IsPalindrome.isPalind(1001));
    assertEquals(true,IsPalindrome.isPalind(11511));

  }

}