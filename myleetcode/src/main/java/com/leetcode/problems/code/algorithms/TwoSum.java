package com.leetcode.problems.code.algorithms;

import java.util.Arrays;

class TwoSum {

  public int[] twoSum(int[] nums, int target) throws Exception {

    int[] result = new int[2];
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    throw new IllegalArgumentException("no solution");
  }

 /** public static void main(String[] args) throws Exception {
    int target = 6;

    int[] sums = {3, 2, 4};

    int[] result = {};
    TwoSum so = new TwoSum();
    result = so.twoSum(sums, target);
    System.out.println(Arrays.toString(result));
  }*/
}
