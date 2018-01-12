package com.leetcode.problems.code.algorithms;

public class ListNode {
  //Definition for singly-linked list.

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }

  public static void main(String[] args) {
    ListNode listNodeF = new ListNode(2);
    ListNode listNodeF_4 = new ListNode(4);
    listNodeF.next = listNodeF_4;

    ListNode listNodeS = new ListNode(5);
    ListNode listNodeS_6 = new ListNode(6);
    ListNode listNodeS_4 = new ListNode(4);
    listNodeS.next = listNodeS_6;
    listNodeS_6.next = listNodeF_4;


  }
}

