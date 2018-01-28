package com.leetcode.problems.code.algorithms;

import java.lang.Integer;
/*Given a 32-bit signed integer, reverse digits of an integer.Example 1:
Input: 123  Output:  321

Example 2: Input: -123 Output: -321

Example 3:Input: 120  Output: 21

Note: Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

  key points:1.range of int literal ist 32 bit,inputvalue must to use long 64 bit, for example,987654321100L, then can not find a error "integer value is too large"
             2.if input overflows, the output can be in the range.
             3.if input is 0,output is 0, result can direkt return 0.
             4. this algorithms is expensive, we need to find a quick solution.
             */


public class ReverseInt {

  public static int reverse(long i) {
    if (i == 0) {
      return 0;
    } else {
      String reverse = "";
      String reverse1 = "";
      String reverse2 = "";

      String origin = String.valueOf(i);
      while (origin.substring((origin.length() - 1)).equals('0')) {
        origin = origin.substring(0, origin.length() - 2);
      }

      if ((origin.charAt(0)) == ('-')) {
        reverse1 = "-";
        origin = origin.substring(1, origin.length());
      }

      for (int j = origin.length() - 1; j >= 0; j--) {
        reverse2 = reverse2 + origin.charAt(j);

      }

      if ((Long.valueOf(reverse1 + reverse2) > Integer.MAX_VALUE) || (
          Long.valueOf(reverse1 + reverse2) < Integer.MIN_VALUE)) {
        return 0;
      } else {
        return (Long.valueOf(reverse1 + reverse2)).intValue();
      }
    }
  }

 /** public static void main(String[] args) {
    System.out.println(ReverseInt.reverse(9876543211L));
  }*/
}


