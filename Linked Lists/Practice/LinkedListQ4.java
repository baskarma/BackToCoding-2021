/* 
 * Find the middle of the given linked list
 */
package Practice;

public class LinkedListQ4 {
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

    public int findMiddle(){
        if(head == null)
            return -1;
        Node ptr1 = head;
        Node ptr2 = head;

        while(ptr1 != null && ptr1.next != null){
            ptr1 = ptr1.next.next; //moves two ahead
            ptr2 = ptr2.next; //moves one ahead
        }

        return ptr2.data;
    }

    public static void main(String[] args){
        LinkedListQ4 list = new LinkedListQ4();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(14);
        list.push(23);

        list.printList();
        System.out.println("Middle node is : " + list.findMiddle());
    }
}

/* 
 * Testcases:
 * 
 * T1 : input = 14 3 2 1 Middle node is : 2
 * T2 : input = 23 14 3 2 1 Middle node is : 3
 */