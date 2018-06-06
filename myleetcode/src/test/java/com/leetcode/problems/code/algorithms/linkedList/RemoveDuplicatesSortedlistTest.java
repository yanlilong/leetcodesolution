package com.leetcode.problems.code.algorithms.linkedList;

import com.leetcode.problems.code.algorithms.List.ListNode;
import com.leetcode.problems.code.algorithms.List.RemoveDuplicatesSortedlist;
import org.junit.Test;

public class RemoveDuplicatesSortedlistTest {

  @Test
  public void deleteDuplicates() throws Exception {
    RemoveDuplicatesSortedlist remove=new RemoveDuplicatesSortedlist();
    ListNode listNode=new ListNode(1);
    listNode.next=new ListNode(1);
    listNode.next.next=new ListNode(2);

    ListNode listNode1=new ListNode(1);
    listNode.next=new ListNode(2);


    assertEquals(listNode1,remove.deleteDuplicates(listNode));

  }

}