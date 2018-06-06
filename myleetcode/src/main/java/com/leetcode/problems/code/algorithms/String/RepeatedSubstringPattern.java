package com.leetcode.problems.code.algorithms.String;

public class RepeatedSubstringPattern {

  public static boolean repeatedSubPattern(String s) {
    if (s.length() > 10000) {
      return false;
    }
    StringBuilder repeatPattern = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      String append = Character.toString(s.charAt(0));
      for (int j = 1; j <= i; j++) {
        append = append + Character.toString(s.charAt(j));
      }

      while (repeatPattern.length() < s.length() && append.length() < s.length()) {

        repeatPattern.append(append);


      }

      if (s.equals(repeatPattern.toString())) {
        return true;
      } else {
        repeatPattern = new StringBuilder();
      }
    }

    return false;
  }

  public static boolean repeatedSubPatternTwo(String s) {
    int l = s.length();
    for (int i = l / 2; i >= 1; i--) {
      if (l % i == 0) {
        int m = l / i;
        String subS = s.substring(0, i);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
          sb.append(subS);
        }
        if(sb.toString().equals(s))
          return true;

      }
    }
    return false;
  }

}
