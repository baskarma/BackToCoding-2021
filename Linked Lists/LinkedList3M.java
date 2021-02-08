/* 
 * Problem Statement:
 * Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 */
public class LinkedList3M {
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

    public void deleteNode(Node n){
        if(n == null || n.next == null)
            return;
        
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;       
    }

    public static void main(String[] args){
        LinkedList3M list = new LinkedList3M();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        System.out.println("Original linked list : ");
        list.printList();

        System.out.println();
        System.out.println("After deletion : ");
        list.deleteNode(list.head.next.next);
        list.printList();
    }
}
