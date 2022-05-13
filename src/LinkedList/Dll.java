package LinkedList;

public class Dll {
    public class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }
    private Node head;
    public void insertFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev = temp;
        temp.next = newNode;
        newNode.prev = prev;
        System.out.println("New Value is"+newNode.val);
        System.out.println("Previous Value is"+prev.val);


    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
