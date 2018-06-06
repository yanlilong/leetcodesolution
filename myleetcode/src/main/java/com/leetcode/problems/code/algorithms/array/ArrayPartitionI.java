package com.leetcode.problems.code.algorithms.array;

import java.util.Arrays;

public class ArrayPartitionI {

  public static int arrayPairSum(int[] nums) {
    int sum = 0;
    Arrays.sort(nums);
    int sumtemp = 0;
    for (int i = 0; i < nums.length - 1; i++) {

      if (nums[i] >= nums[i + 1]) {

        sumtemp = sumtemp + nums[i + 1];

      } else {
        sumtemp = sumtemp + nums[i];

      }
      i++;
    }

    sum = sumtemp;

    return sum;
  }

}