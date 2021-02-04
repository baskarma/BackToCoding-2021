package Practice;
/* 
 * Create a simple linked list with 3 nodes. 
 * Now traverse the created list and print the data of each node.
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

    public void printList(){
        Node n = head;

        while(n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();

        list1.head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        list1.head.next = two;
        two.next = three;

        list1.printList();
    }
}