package com.leetcode.problems.code.algorithms;

  public class LongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String pre = strs[0];
    int i;
    for (i = 0; i < strs.length; i++) {
      while (strs[i].indexOf(pre) != 0) {
        pre = pre.substring(0, pre.length() - 1);
        if (pre.isEmpty()) return "";
      }

    }
    return pre;

  }
}
