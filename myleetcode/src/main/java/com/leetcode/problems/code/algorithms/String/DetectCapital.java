package com.leetcode.problems.code.algorithms.String;

public class DetectCapital {
  public static  boolean detectCap(String s){
    int l=0;
    char[] charS=s.toCharArray();
    for(int i=0;i<s.length();i++){

      if(Character.isUpperCase(charS[i]))
        l++;

    }
    if((l==s.length())||(l==0)||((l==1)&&(Character.isUpperCase(charS[0])))){
      return true;
    }


    return false;
  }

}
