package com.leetcode.problems.code.algorithms.String;

public class CountBinarySubstrings696 {

  public static int countBinarySubstrings(String s) {
    int prvCount = 0;
    int curCount = 0;
    int res = 0;
    char[] sArray = s.toCharArray();
    for (int i = 0; i < sArray.length; i++) {
      curCount++;
      if (i == s.length() - 1 || sArray[i] != sArray[i + 1]) {
        res += Math.min(prvCount, curCount);
        prvCount = curCount;
        curCount = 0;
      }
    }
    return res;
  }
}
