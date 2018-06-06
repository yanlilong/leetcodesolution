package com.leetcode.problems.code.algorithms.String;

public class NumberofSegmentsStr {

  /**public static int countSegments(String s) {
    int result = 0;
    int space = 0;
    int hasLetter = 0;
    s = s.trim();

    if (s.equals("")) {
      return 0;
    } else {
      for (int i = 0; i < s.length(); i++) {
        if (s.toCharArray()[i] == ' ') {

          space = 1;
          if (space == 1) {
            result = result + 1;
          }
        } else {
          hasLetter = 1;
          space = 0;
        }

      }
    }

    if (hasLetter == 0) {
      return 0;
    }
    return result + 1;
  }*/

  public static int numberSeg(String s) {
   int result=0;
    for (int i = 0; i < s.length(); i++) {
if(s.toCharArray()[i]!=' '&&(i==0||s.toCharArray()[i-1]==' ')){
  result++;
}
    }

    return result;
  }

}
