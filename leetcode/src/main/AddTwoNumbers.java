package main;

public class AddTwoNumbers {


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode listNodeAdd = null;
    if ((l1 != null) && (l2 != null) && (l1.next != null) && (l2.next != null) && (l1.next.next
        != null) && (l2.next.next != null)) {
      int i = l1.val + l2.val;
      int j = 0;
      if (i >= 10) {
        i = i - 10;
        j = 1;
      }

      listNodeAdd = new ListNode(i);
      if ((l1.next != null) && l2.next != null) {
        i = l1.next.val + l2.next.val + j;
        if (i >= 10) {
          i = i - 10;
          j = 1;

        } else {
          j = 0;
        }
        listNodeAdd.next = new ListNode(i);
        if ((l1.next.next != null) && l2.next.next != null) {
          i = l1.next.next.val + l2.next.next.val + j;
          j = 0;
          if (i >= 10) {
            i = i - 10;
            j = 1;

          }
          listNodeAdd.next.next = new ListNode(i);
          if (j == 1 && l1.next.next != null) {
            l1.next.next.next = new ListNode(1);
          }

        }


      }


    }
    return listNodeAdd;

  }

  public static void main(String[] args) {
    ListNode listNodeF = new ListNode(5);
    ListNode listNodeF_4 = new ListNode(0);

    ListNode listNodeS = new ListNode(5);
    ListNode listNodeS_6 = new ListNode(0);

    AddTwoNumbers add = new AddTwoNumbers();

    ListNode listNodeAdd = add.addTwoNumbers(listNodeF, listNodeS);
  }
}