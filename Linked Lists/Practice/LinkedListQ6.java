/* 
 * Pairwise swap elements of a given linked list
 */
package Practice;

public class LinkedListQ6 {
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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void swapPairwise(){
        if(head == null)
            return;

        Node current = head;
        while(current != null){
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;

            current = current.next.next;
        }
    }
    
}
