package Practice;
/* 
 * Find Length of a Linked List.
 * Search an element in a Linked List
 * 
 */
public class LinkedListQ1 {
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

    public int getLength(){
        if(head == null)
            return 0;
        
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public boolean searchList(int x){
        if(head == null)
            return false;
        Node n = head;
        while(n != null){
            if(n.data == x)
                return true;
            n = n.next;
        }
        return false;
    }
    public static void main(String[] args){

        LinkedListQ1 list1 = new LinkedListQ1();
        list1.push(1);
        list1.push(2);
        list1.push(3);
        list1.push(23);
        list1.push(45);

        System.out.println("The length of the linked list is : " + list1.getLength());
        System.out.println("Is 23 in the list? " + list1.searchList(0));
    }
}
