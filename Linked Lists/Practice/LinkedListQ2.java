package Practice;
/* 
 * Write a function to get Nth node in a Linked List.
 * 
 */
 public class LinkedListQ2 {
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

    public int GetNth(Node head, int index){
        if(head == null)
            return -1;
        
        Node n = head;
        int count = 0;
        while(n != null){
            n = n.next;
            count++;

            if(count == index)
                return n.data;
        }
        return -1;
    }

    public static void main(String[] args){
        LinkedListQ2 list1 = new LinkedListQ2();

        list1.push(51);
        list1.push(24);
        list1.push(45);
        list1.push(10);
        list1.push(5);
        list1.push(7);

        System.out.println("The node at index 3 is " + list1.GetNth(list1.head, 3));
    }
}
