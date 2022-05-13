package LinkedList;

public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public void insertFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode; 
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        if(head.next==null){
            head.next = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;

    }
    public int deleteFirst(){
        Node temp = head;
        head = head.next;
        temp.next= null;
        return temp.data;
    }
    public int deleteLast(){
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
                prev = temp;
                temp = temp.next;
        }
        prev.next= null;
        return temp.data;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
