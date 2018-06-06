package com.leetcode.problems.code.algorithms.String;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of
 * haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll" Output: 2
 *
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba" Output: -1
 */
public class ImplementstrStr {

  public static int strStr(String haystack, String needle) {
    int leng = -1;
    if (haystack.length() < needle.length()) {
      return leng;
    }

    int i, j;
    for (i = 0, j = 0; i < haystack.length() && j < needle.length(); ) {
      if (needle.charAt(j) == haystack.charAt(i)) {
        j++;
        i++;
      } else {
        if (j != 0) {
          i=i-j-1;
          j = 0;

        } else {
          i++;
        }
      }
    }

    if (j == needle.length()) {
      return i - needle.length();
    }

    return leng;
  }



  public static int strStr1(String haystack, String needle) {
  if(needle==""){
    return 0;
  }else if(haystack.length()<needle.length()){
    return -1;
  }else if(haystack.length()==needle.length()){
    if(haystack.equals(needle)){
      return 0;
    }else{
      return -1;
    }

  }else{
    int i;
    int j=0;
    int index=-1;
    for(i=0;i<haystack.length();i++){
      if(haystack.charAt(i)==needle.charAt(j)){
        if(index==i-(needle.length()-1)){
          return index;
        }else{
          index=i;
          j++;
        }

      }else{
       if(index!=-1)
         i=i-index-1;

        j=0;
      }

    }

  }
    return -1;
  }
}
