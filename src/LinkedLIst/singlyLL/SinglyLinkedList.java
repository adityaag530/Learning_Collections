package LinkedLIst.singlyLL;
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

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Insertion at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Traversal
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Search
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Deletion by key
    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtEnd(7);
        list.insertAtEnd(9);

        System.out.println("Initial list:");
        list.printList(); // Output: 3 5 7 9

        int searchKey = 7;
        System.out.println("Is " + searchKey + " present in the list? " + list.search(searchKey)); // Output: true

        int deleteKey = 5;
        list.delete(deleteKey);
        System.out.println("After deleting " + deleteKey + ":");
        list.printList(); // Output: 3 7 9
    }
}

