package com.leetcode.problems.code.algorithms.HashTable;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class DesignHashSet705Test {

  DesignHashSet705 obj;
  @Before
  public void setup() {
    this.obj = new DesignHashSet705();
  }


  @Test
  public void add() throws Exception {
    obj.add(1);
    assertEquals(true,obj.contains(1));

  }

  @Test
  public void remove() throws Exception {
    obj.remove(1);
    assertEquals(false,obj.contains(1));
  }
  @Test
  public void contains() throws Exception {
    obj.add(2);
    assertEquals(true,obj.contains(2));

  }


}