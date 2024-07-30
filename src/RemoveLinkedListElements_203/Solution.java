package RemoveLinkedListElements_203;

public class Solution {
    public static void main(String[] args) {

        //Declare Nodes
        ListNode head = new ListNode(1, null);
        ListNode head2 = new ListNode(2, null);
        ListNode head3 = new ListNode(6, null);
        ListNode head4 = new ListNode(3, null);
        ListNode head5 = new ListNode(4, null);
        ListNode head6 = new ListNode(5, null);
        ListNode head7 = new ListNode(6, null);

        //Declare next of node
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;

        int val = 6;
        ListNode result = new ListNode();
        result = removeElements(head, val);
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
        if (head != null) {
            System.out.print(head.val);
            show(head.next);
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode result = new ListNode();
        ListNode current = new ListNode();
        current = result;


        while (head != null) {
            if (head.val != val) {
                ListNode temp = new ListNode(head.val, null);
                current.next = temp;
                current = current.next;
            }
            head = head.next;
        }

        return result.next;
    }

}
