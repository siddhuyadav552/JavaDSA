// Recursive search in Singly LinkedList


public class LL2{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add in LL
    public void addFirst(int num){
        Node newNode = new Node(num);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    //print function
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ---> ");
            temp= temp.next;
        }
        System.out.println("null");
    }

    // Recursive Search 

    public void recSearch(int key, Node head){

        //base Case
        if(head == null){
            System.out.println("Not Found.");
            return;
        }
        else if(head.data == key){
            System.out.println("Got it.");
            return;
        }
        //Recursive call
        head = head.next;
        recSearch(key, head);

    }




    public static void main(String[] args){
        LL2 ll = new LL2();
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.print();
        ll.recSearch(5000, head);
    }
}