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

        System.out.println(isPalindrome(testcase1));
    }

    //This solution works almost every testcase
    //But the last test case is so so so so big, so i think i will use string for this =))
    public static boolean isPalindrome(ListNode head) {
        boolean result = false;

        long normalNum = 0;
        long reverseNum = 0;
        long count = 1;

        while (head != null) {
            normalNum = normalNum*10 + head.val;
            reverseNum += head.val*count;
            count*=10;
            head = head.next;
        }

        if (normalNum == reverseNum)
            return true;

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
