/* 
 * Given a ‘key’, delete the first occurrence of this key in the linked list.
 * Delete a Linked List node at a given position.
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

    public void deleteNodeAt(int pos){
        if(head == null)
            return;
        
        Node n = head;
        if(pos == 0){
            head = n.next;
            return;
        }

        for(int i = 0; n != null && i < pos - 1; i++){
            n = n.next;
        }

        if(n == null || n.next == null)
            return;
        
        Node next = n.next.next;
        n.next = next;
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

    public static void main(String[] args){
        LinkedListDeletion list1 = new LinkedListDeletion();

        list1.appendNode(1);
        list1.appendNode(10);
        list1.pushNode(2);
        list1.insertAfter(20, list1.head);
        list1.appendNode(15);
        list1.insertAfter(3, list1.head.next.next);

        System.out.println("Original Linked List : ");
        list1.printList();

        list1.deleteNode(1);
        System.out.println("\nDelete By Key From Linked List : ");
        list1.printList();

        list1.deleteNodeAt(3);
        System.out.println("\nDelete At position From Linked List : ");
        list1.printList();
    }
}
