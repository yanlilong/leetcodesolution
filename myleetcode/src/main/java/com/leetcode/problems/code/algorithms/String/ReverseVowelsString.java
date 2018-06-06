package com.leetcode.problems.code.algorithms.String;

import java.util.List;
import java.util.ArrayList;


public class ReverseVowelsString {

  public static String reverseVowels(String s) {
    StringBuilder result = new StringBuilder();
    List<Integer> position = new ArrayList();
    StringBuilder vowels = new StringBuilder();
    char[] arrayC = s.toCharArray();
    for (int i = 0; i < arrayC.length; i++) {
      if (arrayC[i] == 'a' || arrayC[i] == 'o' || arrayC[i] == 'e' || arrayC[i] == 'u'
          || arrayC[i] == 'i' || arrayC[i] == 'A' || arrayC[i] == 'O' || arrayC[i] == 'E'
          || arrayC[i] == 'U' || arrayC[i] == 'I') {
        position.add(i);
        vowels.append(arrayC[i]);
      }
    }
    vowels = vowels.reverse();
    result.append(arrayC);
    for (int i = 0; i < position.size(); i++) {

      result.deleteCharAt(position.get(i));
      result.insert(position.get(i).intValue(), vowels.charAt(i));
    }
    return result.toString();
  }


}
