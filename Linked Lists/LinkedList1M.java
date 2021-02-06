import java.util.HashSet;

/* 
 * Problem Statement:
 * Write code to remove duplicates from an unsorted linked list.
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class LinkedList1M {
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

    public void removeDuplicates(Node list){
        
        HashSet<Integer> hSet = new HashSet<>();

        Node current = list;
        Node prev = null;

        while(current != null){
            int currData = current.data;
            
            if(hSet.contains(currData)){
                prev.next = current.next;
            }
            else{
                hSet.add(currData);
                prev = current;
            }
            current = current.next;
        } 
    }

    public static void main(String[] args){
        LinkedList1M list = new LinkedList1M();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(1);
        list.push(4);
        list.push(2);
        list.push(5);
        list.push(6);
        list.push(1);

        System.out.println("Initial Linked List : ");
        list.printList();

        System.out.println("After Removing Duplicates : ");
        list.removeDuplicates(list.head);
        list.printList();
    }
}
