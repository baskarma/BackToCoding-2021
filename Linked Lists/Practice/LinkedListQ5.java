/* 
 * Write a function that counts the number of times a given int occurs in a Linked List
 */
package Practice;

public class LinkedListQ5 {
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

    public int countKeyOccurrence(int key){
        if(head == null)
            return -1;
        
        int count = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        LinkedListQ5 list = new LinkedListQ5();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(1);

        list.printList();
        int key = 22;
        System.out.println("Number of occurrences of " + key + " : " + list.countKeyOccurrence(key));
    }
}

/*
 * Testcases:
 * 
 * T1 : input = 1 3 2 1 1 2 3 2 1 Number of occurrences of 1 : 4
 * T2 : input = 1 3 2 1 1 2 3 2 1 Number of occurrences of 2 : 3
 * T3 : input = 1 3 2 1 1 2 3 2 1 Number of occurrences of 22 : 0
 */
