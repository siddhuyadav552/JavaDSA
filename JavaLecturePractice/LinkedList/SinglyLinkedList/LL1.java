//Singly Linked List CRUD operations 

//ADD FIRST IN LL
//ADD LAST IN LL
//Print a Linked list
//ADD int the middle of LL
//Size of LL
// Remove First in LL
// Remove Last in LL
// Iterative Search

public class LL1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;
    // Methods
    // printing ll

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add() On first place

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // remove()
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Insert in between

    public void add(int index, int data) {
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;

        while (i < index - 1) {
            i++;
            temp = temp.next;
        }

        newNode.next = temp.next; // filhal temp node 3 pr hai, es line se ham node 50 ke next ko node 2 pr set
                                  // krenge
        temp.next = newNode;// yha Node 3 ko bta dia ki ab tumhara next Node 50 hai.

    }

    // To remove Head Node

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return;
        } else if (size == 1) {
            int val = head.data;
            return;
        }
        head = head.next;
        size--;
    }

    // To Remove Last Node

    public void removeLast() {
        Node temp = head;
        int i = 0;

        while (i < size - 2) {
            temp = temp.next;
            i++;
        }

        tail = temp;
        tail.next = null;
        size--;

    }

    // To Search Item in LinkedList using iteration

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    public static void main(String[] args) {
        LL1 ll = new LL1();
        ll.addFirst(5);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addLast(3);
        ll.addLast(2);
        ll.add(3, 50);

        ll.print();

        ll.removeLast();

        ll.print();

    }
}