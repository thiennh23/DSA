package MiddleOfLinkedList_876;


//This solution use the 2 pointers way
//We see that: if we divided by 2, we will receive the middle node
//So, We will use 2 pointer
//1 pointer called Slow, go through Node by Node
//1 pointer called Fast, go 2 Node a time
//Run time: O(n). We have 2 pointer but just go through the LL 1 time
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

        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        slow = head;
        fast = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
            else break;
            slow = slow.next;
        }
        return slow;
    }
}
