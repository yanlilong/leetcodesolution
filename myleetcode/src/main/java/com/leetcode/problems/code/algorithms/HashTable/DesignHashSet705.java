package com.leetcode.problems.code.algorithms.HashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class DesignHashSet705 {

 List<Integer> hashSet;

  /**
   * Initialize your data structure here.
   */
  public DesignHashSet705() {
    this.hashSet = new ArrayList<>();
  }

  public void add(int key) {
   if(!hashSet.contains(key))
     hashSet.add(key);


  }

  public void remove(int key) {
    if(hashSet.contains(key)) {
     int index= hashSet.indexOf(key);
     hashSet.remove(index);
    }

  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int key) {
    if (hashSet.contains(key)) {
      return true;
    } else {
      return false;
    }

  }

}
