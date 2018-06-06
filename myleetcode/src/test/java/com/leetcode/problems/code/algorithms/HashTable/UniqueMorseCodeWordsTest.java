package com.leetcode.problems.code.algorithms.HashTable;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueMorseCodeWordsTest {

  @Test
  public void uniqueMorseCodeWords() throws Exception {
    UniqueMorseCodeWords translate1=new UniqueMorseCodeWords();
    String[]words={"gin", "zen", "gig", "msg"};
    assertEquals(2,translate1.uniqueMorseCodeWords(words));

    String[]words2={"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
    assertEquals(1,translate1.uniqueMorseCodeWords(words2));


  }

}