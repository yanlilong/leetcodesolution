package com.leetcode.problems.code.algorithms.String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class MostCommonWord819 {
  public static String mostCommonWord1(String paragraph, String[] banned) {
    paragraph+=".";
    Set<String>banset=new HashSet();
    for(String word:banned) banset.add(word);
    Map<String,Integer>count=new HashMap();
    String ans="";
    int ansfreq=0;

return null;
  }




  /**public static TreeMap<String,Integer>  sortMapByValue(HashMap<String,Integer>map){
    Comparator<String>comparator=new ValueComparator(map);
    return result;
  }*/

  /**public static String mostCommonWord(String paragraph, String[] banned) {
    StringBuilder word = new StringBuilder();
    HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
    TreeMap<String, Integer> sortedMap = sortMapByValue(map);
    String punctutations = "!?',;.";
    char[] arrayS = paragraph.toCharArray();
    for (int i = 0; i < arrayS[i]; i++) {

      if (!punctutations.contains(String.valueOf(arrayS[i]))) {
        if (arrayS[i] != ' ') {
          word.append(arrayS[i]);
        } else if (arrayS[i] == ' ') {

          if (wordCount.containsKey(word.toString())&&!word.toString().equals(banned.toString())) {
            wordCount.replace(word.toString(), wordCount.get(word.toString() + 1));

          } else {
            if(!word.toString().equals(banned.toString()))
            wordCount.put(word.toString(), 1);
          }

          word = new StringBuilder();

        } else if (i == arrayS.length - 1) {
          word.append(arrayS[i]);
          if (wordCount.containsKey(word.toString())&&!word.toString().equals(banned.toString())) {
            wordCount.replace(word.toString(), wordCount.get(word.toString() + 1));

          } else {
            if(!word.toString().equals(banned.toString()))
              wordCount.put(word.toString(), 1);
          }
        }
      }
    }
    Iterator<Integer> it = wordCount.values().iterator();
    int big = 0;
    while (it.hasNext()) {
      int next = it.next();
      if (big > next)
        big = next;
    }

  }*/

}
