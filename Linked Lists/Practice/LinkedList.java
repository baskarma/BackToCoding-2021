/* 
 * Create a simple linked list with 3 nodes. 
 */

public class LinkedList {
    Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();

        list1.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        list1.head.next = two;
        two.next = three;

    }
}