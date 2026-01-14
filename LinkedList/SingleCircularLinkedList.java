public class SingleCircularLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(0);
        list.display();
        list.addLast(30);
        list.addLast(40);
        list.addLast(45);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        System.out.println(list.isEmpty());
        System.out.println(list.length());
        System.out.print(list.occur(30));
    }
}
class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    Node tail;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void deleteFirst() {
        if (isEmpty()) {
            return;
        } head = head.next;
        tail.next = head;
    }
    public void deleteLast() {
        if (isEmpty()) {
            return;
        }  Node currNode = head;
        while (currNode.next != tail) {
            currNode = currNode.next;
        } tail = currNode;
        tail.next = head;
    }
    public void display() {
        if (isEmpty()) {
            return;
        } Node currNode = head;
        do {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        } while (currNode != head);
        System.out.println();
    }
    public boolean isEmpty() {
        if (head == null) {
            System.out.println("List is Empty");
            return true;
        } return false;
    }

    public int length() {
        if (isEmpty()) {
            return 0;
        } Node currNode = head;
        int count = 0;
        do {
            count++;
            currNode = currNode.next;
        } while (currNode != head);
        return count;
    }
    public boolean occur(int data) {
        if (isEmpty()) {
            return false;
        } Node currNode = head;
        do {
            if (currNode.data == data) {
                return true;
            } currNode = currNode.next;
        } while (currNode != head);
        return false;
    }
}
