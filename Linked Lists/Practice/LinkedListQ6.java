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
        while(current.next != null){
            int temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;

            current = current.next.next;
        }
    }
    
    public static void main(String[] args){
        LinkedListQ6 list = new LinkedListQ6();
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        //list.push(1);

        list.printList();
        System.out.print(" Swapped list : " );
        list.swapPairwise();
        list.printList();
    }
}

/* 
 * Testcases:
 * 
 * T1 : input = 1 2 3 4 5 6  Swapped list : 2 1 4 3 6 5 
 * T2 : input = 2 3 4 5 6  Swapped list : 3 2 5 4 6
 * T3 : input = 1  Swapped list : 1
 */