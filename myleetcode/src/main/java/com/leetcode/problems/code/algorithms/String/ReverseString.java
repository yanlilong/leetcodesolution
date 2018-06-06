package com.leetcode.problems.code.algorithms.String;

public class ReverseString {
  public static  String reverse(String s){
    StringBuilder result=new StringBuilder();

    if(s.length()==0||s.length()==1){
      return s;
    }else{
      char [] charS=s.toCharArray();
      for(int i=charS.length-1;i>=0;i--){
        result.append(charS[i]);
      }
    }

    return result.toString();
  }
  public static  String reverse2(String s){
    StringBuilder result=new StringBuilder(s);

    return result.reverse().toString();
  }

}
