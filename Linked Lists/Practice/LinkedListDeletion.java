/* 
 * Given a ‘key’, delete the first occurrence of this key in the linked list.
 */

public class LinkedListDeletion {
    Node head;

    public class Node{
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
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void deleteNode(int key){
        Node n = head;
        Node prev = null;

        if(n != null && n.data == key){
            head = n.next;
            return;
        }

        while(n != null && n.data != key){
            prev = n;
            n = n.next;
        }

        if(n == null)
            return;
        
        prev.next = n.next;
    }

    public void pushNode(int newData){
        Node newNode = new Node(newData);
        
        newNode.next = head;
        head = newNode;
    }

    public void appendNode(int newData){
        if(head == null){
            head = new Node(newData);
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = null;

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    public void insertAfter(int newData, Node prevNode){
        if(prevNode == null) {
            System.out.println("Given Node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
}
