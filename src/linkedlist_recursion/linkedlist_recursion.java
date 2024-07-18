package linkedlist_recursion;

public class linkedlist_recursion {

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(3);
        Node d = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        show(a);

        //a = insertHead(100, a);
        //a = insertTail(102, a);
        //a = insertAt(1020, 312312, a);
        show(a);
    }

    //Delete a Node

    //Insert after a value
    //Node start at 0 -> 1 -> 2 -> 3 -> ...
    public static Node insertAt(int value, int pos, Node head) {
        Node current = head;

        if (pos < 0)
            return head;
        else if (pos == 0)
            return insertHead(value, head);

        //Find the position
        int count = 0;
        Node previous = null;
        while (current != null && count != pos) {
            count++;
            previous = current;
            current = current.next;
        }


        //Found the position, Insert
        // Create new node
        Node newNode = new Node(value);

        // Insert at the position
        if (previous != null) {
            previous.next = newNode;
        }
        newNode.next = current;

        return head;
    }

    //Inset tail
    public static void insertTail(int value, Node head) {
        Node newNode = new Node(value, null);
        Node current = head;

        if (current == null)
            return ;

        while (current.next != null)
            current = current.next;

        current.next = newNode;
        //return head;
    }

    //Insert head
    public static Node insertHead(int value, Node head) {
        if (head != null) {
            Node newNode = new Node(value, head);
            head = newNode;
        }
        return head;
    }

    //Print Nodes using recursion
    public static void show(Node head) {
        Node current = head;
        if (current != null) {
            System.out.print(current.val + " ");
            show(current.next);
        } else {
            System.out.println();
            return;
        }
    }

    public static class Node {
        int val;
        Node next;
        Node(int val) {this.val = val;}
        Node(int val, Node next) {this.val = val; this.next = next;}
    }
}
