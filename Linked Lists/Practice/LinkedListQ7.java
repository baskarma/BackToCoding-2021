/* 
 * Detect loop in a linked list.
 */
package Practice;

import java.util.HashSet;

public class LinkedListQ7 {
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

    public boolean detectLoop(){
        HashSet<Node> hs = new HashSet<Node>();
        Node temp = head;
        while(temp != null){
            if(hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args){
        LinkedListQ7 list = new LinkedListQ7();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        //Creating a loop - Result : Loop Found.
        list.head.next.next.next.next = list.head;
        
        if(list.detectLoop())
            System.out.println("Loop Found!");
        else
            System.out.println("No Loop Found :(");
    }
}
