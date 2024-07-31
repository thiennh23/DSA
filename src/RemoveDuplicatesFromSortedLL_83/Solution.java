package RemoveDuplicatesFromSortedLL_83;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode head2 = new ListNode(1, null);
        ListNode head3 = new ListNode(2, null);

        head.next = head2;
        head2.next = head3;

        ListNode result = new ListNode();
        result = deleteDuplicates(head);
        show(result);
    }

    public static ListNode deleteDuplicates(ListNode head) {

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
