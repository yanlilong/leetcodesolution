package com.leetcode.problems.code.algorithms;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

/*
* 21: Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/
public class MergeTwoSortedListsTest {

  @Test
  public void mergeList() throws Exception {
    ListNode listOne = new ListNode(1);
    listOne.next = new ListNode(2);
    listOne.next.next = new ListNode(4);

    ListNode listTwo = new ListNode(1);
    listTwo.next = new ListNode(3);
    listTwo.next.next = new ListNode(4);

    ListNode mergeList = new ListNode(1);
    mergeList.next = new ListNode(1);
    mergeList.next.next = new ListNode(2);
    mergeList.next.next.next = new ListNode(3);
    mergeList.next.next.next.next = new ListNode(4);
    mergeList.next.next.next.next.next = new ListNode(4);
    ListNode a = MergeTwoSortedLists.mergeTwoLists(listOne, listTwo);
    assertEquals(a.next.val, mergeList.next.val);


  }

}