package com.leetcode.problems.code.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class MaximumSubarray {

  public static int maximumSubarray(Integer[] arrySum) {
    int n=arrySum.length;
    int[]dp=new int[n];
    dp[0]=arrySum[0];
    int max=dp[0];

    for(int i=1;i<n;i++){
      dp[i]=arrySum[i]+(dp[i-1]>0?dp[i-1]:0);
      max=Math.max(max,dp[i]);

    }

    return 0;
  }

}
