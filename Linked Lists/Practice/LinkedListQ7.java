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

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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

    }
}
