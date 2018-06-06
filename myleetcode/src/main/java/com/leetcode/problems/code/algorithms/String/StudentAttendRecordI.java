package com.leetcode.problems.code.algorithms.String;

public class StudentAttendRecordI {

  public static boolean studentAttendRecordI(String s) {
    int countA = 0;
    int countL = 0;
    char[] charS=s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      if (charS[i] == 'A') {
        countA++;
      } else if (i+2<=s.length()-1){
          if((charS[i] == 'L')&&(charS[i+1]=='L')&&(charS[i+2]=='L')){
        return false;
        }
      }

    if (countA > 1 ) {
      return false;
    }


  }
    return true;
  }
}
