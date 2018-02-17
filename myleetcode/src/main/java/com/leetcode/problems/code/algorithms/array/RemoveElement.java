package com.leetcode.problems.code.algorithms.array;

public class RemoveElement {

  public static int removeElement(int[] num, int val) {
    int i = 0;
    for (int j = 0; j < num.length; j++) {
      if (num[j] == val) {
        i++;
      }

    }

    return num.length - i;
  }

}
