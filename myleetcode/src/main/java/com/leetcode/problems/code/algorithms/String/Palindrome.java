package com.leetcode.problems.code.algorithms.String;

public class Palindrome {

  public static boolean isPalindrome(String s) {
    s=s.toUpperCase();
    System.out.println(s);
    String result = "";

    for (int i = s.length() - 1; i >= 0; i--) {
      result = result + s.charAt(i);
    }
    result=result.toUpperCase();
    System.out.println(result);
    if (result.equals(s)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String... args) {
    String palind = "Dot saw I was Tod";

    System.out.println(Palindrome.isPalindrome(palind));
  }

}
