package com.leetcode.problems.code.algorithms.String;

/**
 * 比较两个字符串的长度，若不相等，则返回长度的较大值，若相等则再判断两个字符串是否相同，若相同则返回-1，否则返回长度。
 */
public class LangstuncommonString {
  public static int findLUSlength(String a, String b) {
    if(a.length()>b.length()){
      return a.length();
    }else if(a.length()<b.length()){
      return b.length();
    }else if(a.length()==b.length()){
      if(a.equals(b))
        return -1;
      return a.length();

    }
return -1;
  }

}
