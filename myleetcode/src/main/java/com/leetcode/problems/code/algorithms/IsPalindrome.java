package com.leetcode.problems.code.algorithms;


public class IsPalindrome {

  public static boolean isPalind(int in) {
    boolean isPa = true;
    String origin = String.valueOf(in);
    for (int i = 0; i < origin.length() - 1; i++) {
      if (origin.charAt(i) != origin.charAt(origin.length() - 1 - i)) {
        isPa = false;
      }
    }
    return isPa;
  }

}
