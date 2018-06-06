package com.leetcode.problems.code.algorithms.String;

public class ReverseWordsStringIII {

  public static String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    StringBuilder childResult = new StringBuilder();
    char[]arrayS=s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      if (arrayS[i] == ' ') {
        result.append(childResult.reverse());

        result.append(' ');
        childResult = new StringBuilder();
      } else if (i == s.length() - 1) {
        childResult.append(arrayS[i]);
        childResult.reverse();
        result.append(childResult);

      } else {
        childResult.append(arrayS[i]);
      }
    }
    return result.toString();

  }



  public static String reverseWords1(String s) {
    StringBuilder result=new StringBuilder();
String[]arrayS=s.split(" ");
for(int i=0;i<arrayS.length;i++){
  StringBuilder word=new StringBuilder();
  word.append(arrayS[i]);
  word.reverse();
  result.append(word);
  if(i!= arrayS.length-1)
  result.append(" ");
}

return result.toString();

  }
}
