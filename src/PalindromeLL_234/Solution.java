package PalindromeLL_234;

public class Solution {

    public static void main(String[] args) {

        //Test case 1
        ListNode head = new ListNode(1, null);
        ListNode a = new ListNode(2, null);
        ListNode b = new ListNode(2, null);
        ListNode c = new ListNode(1, null);

        head.next = a;
        a.next = b;
        b.next = c;

        /*int[] values = {1, 2, 2, 1, 5, 7, 5, 3, 8, 9, 0, 6, 5, 9, 6, 9, 2, 1, 3, 0, 8, 8, 4, 8, 9, 0, 3, 5, 6, 8, 9, 0, 1, 3, 2, 1, 0, 9, 8, 6, 5, 3, 0, 9, 8, 4, 8, 8, 0, 3, 1, 2, 9, 6, 9, 5, 6, 0, 9, 8, 3, 5, 7, 5, 1, 2, 2, 1};
        ListNode head = createLinkedList(values);*/

        System.out.println(isPalindrome(head));
    }

    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    //This solution works almost every testcase
    //But the last test case is so so so so big. So i need to think about another way
    /*public static boolean isPalindrome(ListNode head) {
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
    }*/

    //Use this String technique instead
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!= null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //Slow also is the middle of the linkedlist
        //Now we will reverse the linkedlist
        ListNode reverse = new ListNode();
        while (slow != null) {

        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
