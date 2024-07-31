package RemoveDuplicatesFromSortedLL_83;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode head2 = new ListNode(1, null);
        ListNode head3 = new ListNode(2, null);
        ListNode head4 = new ListNode(3, null);
        ListNode head5 = new ListNode(3, null);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        ListNode result = new ListNode();
        result = deleteDuplicates(head);
        show(result);
    }

    //Maybe we can use 2 pointers technique
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        left = head;
        right = left.next;

        while (left.next != null) {
            if (left.val == right.val) {
                left.next = right.next;
            } else {
                left = left.next;
            }
            right = right.next;
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static void show(ListNode head) {
        if (head != null) {
            System.out.print(head.val);
            show(head.next);
        }
    }
}
