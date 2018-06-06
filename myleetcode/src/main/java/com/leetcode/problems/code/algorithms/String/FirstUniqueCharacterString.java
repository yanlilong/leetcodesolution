package com.leetcode.problems.code.algorithms.String;

public class FirstUniqueCharacterString {

  public static int firstUniqChar(String s) {
int result=-1;

    char[] arrayS = s.toCharArray();
    for (int i = 0; i < arrayS.length; i++) {
      boolean same=false;
      for (int j = i+1 ; j < arrayS.length; j++) {

        if (arrayS[i] == arrayS[j]) {
          same=true;
        }
      }
      if (same ==false) {
        return i;
      }
    }
    return result;
  }


}
