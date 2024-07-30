package ConvertBinaryNumberInLinkedListToInteger_1290;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode head1 = new ListNode(0, null);
        ListNode head2 = new ListNode(1, null);

        head.next = head1;
        head1.next = head2;

        int result = getDecimalValue(head);
        System.out.println(result);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static int getDecimalValue(ListNode head) {
        //Count how many node in the LinkedList
        ListNode currentCount = new ListNode();
        currentCount = head;
        int count = -1;
        while (currentCount != null) {
            count++;
            currentCount = currentCount.next;
        }

        //Start calculate
        ListNode current = new ListNode();
        current = head;
        int result = 0;
        while (current != null) {
            result = result + current.val*getPow(count);
            count--;
            current = current.next;
        }
        return result;
    }

    public static int getPow(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        int result = 2;
        for (int i = 2; i <= n; i++)
            result = result * 2;
        return result;
    }
}
