package com.leetcode.problems.code.algorithms.array;

import java.util.Arrays;

public class MajorityElement {

  public static int majorityElement(int[] nums) {
    int majoritycount = nums.length / 2;

    for (int i : nums) {
      int times = 0;

      for (int j : nums) {
        if (j == i) {
          times++;
        }
      }
      if (times > majoritycount) {
        return i;
      }
    }
    return -1;

  }

}
