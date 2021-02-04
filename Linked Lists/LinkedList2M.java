/*
 * Problem Statement:
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class LinkedList2M {
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

        Node pMain = head;
        Node pReference = head;

        for(int i = 0; i < k; i++){
            if(pReference.next != null)
                pReference = pReference.next;
            else
                return -1;
        }

        while(pReference != null){
            pMain = pMain.next;
            pReference = pReference.next;
        }

        return pMain.data;
    }
    public static void main(String[] args){
        LinkedList2M list = new LinkedList2M();
        list.push(1);
        list.push(3);
        list.push(5);
        list.push(7);
        list.push(9);
        list.push(11);

        System.out.println("List : ");
        list.printList();
        int k = 4;
        System.out.println("\nThe value of the kth (" + k +") node from end is : " + list.GetKthFromEnd(k));
    }
}

/*
 * Testcases :
 * 
 * T1: input: 11->9->7->5->3->1  k = 2   The value of the kth (2) node from end is : 3
 * T2: input: 11->9->7->5->3->1  k = 10  The value of the kth (12) node from end is : -1
 * T3: input: 11->9->7->5->3->1  k = 4  The value of the kth (12) node from end is : 7
 */
