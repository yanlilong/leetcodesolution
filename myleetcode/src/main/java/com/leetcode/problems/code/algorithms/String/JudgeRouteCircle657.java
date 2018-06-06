package com.leetcode.problems.code.algorithms.String;

public class JudgeRouteCircle657 {

  public static boolean judgeCircle(String moves) {
    int initx = 0;
    int inity = 0;
    for (char c : moves.toCharArray()) {

      switch (c) {
        case 'U':
          inity++;
          break;
        case 'D':
          inity--;
          break;
        case 'R':
          initx++;
          break;
        case 'L':
          initx--;
          break;
      }


    }
    return initx == 0 && inity == 0;


  }

}
