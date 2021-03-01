/* 
 * Problem Statement : 
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
 */

public class LinkedList4M {
    Node head;

    public class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
