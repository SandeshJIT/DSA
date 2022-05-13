package LinkedList;

public class Main {
    public static void main(String args[]){

        // Singly LinkedList
        // LinkedList ll = new LinkedList();
        // ll.insertFirst(10);
        // ll.insertFirst(20);
        // ll.insertFirst(30);
        // ll.insertFirst(40);
        // ll.insertFirst(50);
        // ll.display();
        // // ll.deleteLast();
        // System.out.println("The deleted element is"+ll.deleteLast());
        // ll.display();
        
         
        //Double LinkedList
        Dll dll = new Dll();
        dll.insertLast(10);
        dll.insertLast(20);
        dll.insertLast(30);
        dll.insertLast(40);
        dll.display();
    }
}

