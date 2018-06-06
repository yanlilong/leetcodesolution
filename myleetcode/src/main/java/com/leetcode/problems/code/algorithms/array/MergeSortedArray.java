package com.leetcode.problems.code.algorithms.array;

public class MergeSortedArray {

  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int[] result = new int[m + n];
    StringBuilder merge = new StringBuilder();
    merge.append(nums1.toString());
    merge.append(nums2.toString());
    char[] mergeArray = merge.toString().toCharArray();
    for (int i = 0; i < mergeArray.length; i++) {
      result[i] = (int) mergeArray[i];
    }
    return result;
  }

}
