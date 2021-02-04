/* 
 * Given a Linked List and a number n,
 * write a function that returns the value at the n’th node from the end of the Linked List.
 */
public class LinkedListQ3 {
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
    public int GetKthFromEnd(int k){
        if(head == null)
            return -1;
        
        Node temp = head;

        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(k > count)
            return -1;
        
        temp = head;

        for(int i = 1; i < count - k + 1; i++){
            temp = temp.next;
        }

        return temp.data;
    }

    public static void main(String[] args){
        LinkedListQ3 list = new LinkedListQ3();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(1);
        list.printList();
        int k = 2;
        System.out.println("The " + k + "value from the end is " + list.GetKthFromEnd(k));
    }
}
