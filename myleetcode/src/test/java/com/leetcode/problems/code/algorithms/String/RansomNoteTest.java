package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class RansomNoteTest {

  @Test
  public void canConstruct() throws Exception {
    assertTrue(RansomNote.canConstruct("bg","bbgbjagbjagbddfgdiaigdadhcfcj"));
    assertTrue(RansomNote.canConstruct("",""));
    assertFalse(RansomNote.canConstruct("a","b"));
    assertTrue(RansomNote.canConstruct("aa","ccacaa"));
    assertTrue(RansomNote.canConstruct("aa","aac"));
    assertTrue(RansomNote.canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
  }

}