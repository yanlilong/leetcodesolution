package com.leetcode.problems.code.algorithms.String;

public class IsPalindrome {

  public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int aLength = s.length();

    boolean is = true;

    int len = (aLength % 2 == 0) ? aLength / 2 : (aLength - 1) / 2;

    if (aLength == 0 || aLength == 1) {
      return true;
    } else if (aLength >= 2) {
      for (int i = 0, j = aLength - 1; i < len || j > len; i++, j--) {
        if (!Character.isLetterOrDigit(s.charAt(i))) {
          i++;
        } else if (!Character.isLetterOrDigit(s.charAt(j))) {
          j--;
        } else if (s.charAt(i) != s.charAt(j)) {
          return false;
        }
      }
    }

    return is;
  }

}