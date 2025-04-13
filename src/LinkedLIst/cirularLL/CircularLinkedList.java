package LinkedLIst.cirularLL;
/*
 * @author adityagupta
 * @date 01/04/24
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insertion at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail back to head to form a circle
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point back to head
        }
    }

    // Insertion at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail back to head to form a circle
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Update tail to point back to head
        }
    }

    // Traversal
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Other operations such as search and delete can be implemented similarly

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtEnd(7);
        list.insertAtEnd(9);

        System.out.println("Circular list:");
        list.printList(); // Output: 3 5 7 9
    }
}

