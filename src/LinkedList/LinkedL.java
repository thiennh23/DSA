package LinkedList;

public class LinkedL {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(13);
        list.insert(134);
        list.show();
        System.out.println();
        list.insertHead(999);
        list.show();
        System.out.println();
        list.insertHead(329);
        list.show();

    }

    public static class LinkedList {
        Node head;

        public void insertAt(int data, int index) {
            Node newNode = new Node();
            newNode.next = null;
            newNode.data = data;
            int count = 0;
            if (head == null) {
                if (index == 0)
                    head = newNode;
                else return;
            }
        }

        public void insertHead(int data) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;

            if (head == null)
                head = newNode;
            else {
                newNode.next = head;
                head = newNode;
            }

        }

        public void show() {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }

        public void insert(int data) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;

            //If this is the first node -> assign "next" = null
            if (head == null)
                head = newNode;
            else {
                Node n = head;
                while (n.next != null)
                    n = n.next;
                n.next = newNode;
            }
        }
    }

    public static class Node {
        int data;
        Node next;
    }
}
