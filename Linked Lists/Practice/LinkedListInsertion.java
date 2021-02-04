package Practice;
/* 
 * Insert a new node into a linked list by the following:
 * 1) At the front of the linked list
 * 2) After a given node
 * 3) At the end of the linked list
 * 
 */

public class LinkedListInsertion {
    Node head;

    public class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    //print LL
    public void printList(){
        Node n = head;

        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    //Add node at the front of the linked list
    public void pushNode(int newData){
        //Create a new node.
        Node newNode = new Node(newData);
        //Swap head node.
        newNode.next = head;
        head = newNode;
    }

    //Add node after a given node
    public void insertAfter(int newData, Node prevNode){
        if(prevNode == null) {
            System.out.println("Given Node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    //Add node at the end of the linked list
    public void appendNode(int newData){
        if(head == null){
            head = new Node(newData);
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = null; //end of LL

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = newNode;
    }

    public static void main(String[] args){

        LinkedListInsertion list1 = new LinkedListInsertion();
        list1.appendNode(5);
        list1.pushNode(10);
        list1.pushNode(15);
        list1.pushNode(25);
        list1.insertAfter(20, list1.head);

        list1.printList();
    }
}
