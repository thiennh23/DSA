package PalindromeLL_234;

import LinkedList.LinkedL;

public class Solution {

    public static void main(String[] args) {

        //Test case 1
        ListNode testcase1 = new ListNode(1, null);
        ListNode a = new ListNode(2, null);
        ListNode b = new ListNode(2, null);
        ListNode c = new ListNode(1, null);

        testcase1.next = a;
        a.next = b;
        b.next = c;

        ListNode result = isPalindrome(testcase1);
        System.out.println(result.val);


        //Test case 2
        ListNode testcase2 = new ListNode(1, null);
        ListNode a2 = new ListNode(2, null);

        testcase2.next = a2;
        result = isPalindrome(testcase2);
        System.out.println(result.val);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode isPalindrome(ListNode head) {
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }



        return tail;
    }

}
