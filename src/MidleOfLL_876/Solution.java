package MidleOfLL_876;

public class Solution {
    public static void main(String[] args) {
        //Test case
        ListNode head = new ListNode(1, null);
        ListNode head2 = new ListNode(2, null);
        ListNode head3 = new ListNode(3, null);
        ListNode head4 = new ListNode(4, null);
        ListNode head5 = new ListNode(5, null);
        ListNode head6 = new ListNode(6, null);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        ListNode result = new ListNode();
        result = middleNode(head);
        show(result);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static void show(ListNode head) {
        if (head != null){
            System.out.print(head.val);
            show(head.next);
        }
    }

    public static ListNode middleNode(ListNode head) {
        if (head == null) return null;

        ListNode result = new ListNode();
        result = head;
        int totalNode = 0;

        while (result != null) {
            totalNode++;
            result = result.next;
        }

        totalNode = (totalNode / 2);

        while (totalNode > 0) {
            totalNode--;
            head = head.next;
        }
        return head;
    }
}
