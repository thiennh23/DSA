package LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(4);
        Node NodeB = new Node(2);
        Node NodeC = new Node(3);
        Node NodeD = new Node(10);
        Node NodeE = new Node(2);
        Node NodeF = new Node(98);

        head.next = NodeB;
        NodeB.next = NodeC;
        NodeC.next = NodeD;
        NodeD.next = NodeE;
        NodeE.next = NodeF;

        System.out.println(head.data);
        System.out.println(NodeB.data);
        System.out.println(NodeC.data);
        System.out.println(NodeD.data);
        System.out.println(NodeE.data);
        System.out.println(NodeF.data);

        Node headtest = new Node(4);


        System.out.println("The number of nodes is: " + countNode2(head));
        System.out.println("The number of nodes is: " + countNode2(headtest));

    }

    public static int countNode(Node head) {
        int count = 1;
        Node currentNode = head;

        while (currentNode.next != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static int countNode2(Node head) {
        Node currentNode = head;
        if (currentNode.next == null)
            return 1;
        else return countNode2(currentNode.next) + 1;
    }



    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}