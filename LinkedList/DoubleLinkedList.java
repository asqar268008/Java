public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.display();
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(0);
        list.display();
        list.reverse();
        list.addLast(15);
        list.addLast(20);
        list.addLast(30);
        list.display();
        list.addAtPosition(70, 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtPosition(2);
        list.display(); 
        list.deleteElement(70);
        list.display();
        System.out.println(list.occur(70));
    }
}
class Node {
    Node prv;
    int data;
    Node next;
    Node (int data) {
        this.prv = null;
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
        } else {
            newNode.next = head;
            head.prv = newNode;
            head = newNode;
        }
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prv = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Position is Invalid");
            return;
        } if (pos == 1) {
            addFirst(data);
            return;
        } int count = 1;
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.next != null && count < pos - 1) {
            currNode = currNode.next;
            count++;
        } if (currNode.next == null) {
            if (count == pos - 1) {
                addLast(data);
                return;
            } System.out.println("Invalid Position");
            return;
        } newNode.next = currNode.next; 
        currNode.next.prv = newNode;
        newNode.prv = currNode;
        currNode.next = newNode;
    }
    public void deleteFirst() {
        if (isEmpty()) {
            return;
        } head = head.next;
        head.prv = null;
    }
    public void deleteLast() {
        if (isEmpty()) {
            return;
        } tail = tail.prv;
        tail.next = null;
    }
    public void deleteAtPosition(int pos) {
        if (isEmpty()) {
            return;
        } if (pos <= 0) {
            System.out.println("Position is Invalid");
            return;
        } if (pos == 1) {
            deleteFirst();
            return;
        } int count = 1;
        Node currNode = head;
        while (currNode.next != null && count < pos - 1) {
            currNode = currNode.next;
            count++;
        } if (currNode.next == null) {
            if (count == pos - 1) {
                deleteLast();
                return;
            } System.out.println("Invalid Position");
            return;
        } currNode.next = currNode.next.next;
        currNode.next.prv = currNode;
    }
    public void deleteElement(int data) {
        if (isEmpty()) {
            return;
        } Node currNode = head;
        while (currNode != null) {
            if (currNode.data == data) {
                if (currNode == head) {
                    deleteFirst();
                    return;
                } if (currNode == tail) {
                    deleteLast();
                    return;
                } currNode.prv.next = currNode.next;
                currNode.next.prv = currNode.prv;
                return;
            } currNode = currNode.next;
        } System.out.println("Element is not Found");
    }
    public boolean isEmpty() {
        if (head == null) {
            System.out.println("List is Empty");
            return true;
        } return false;
    }
    public void display() {
        if (isEmpty()) {
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        } System.out.println();
    }
    public void reverse() {
        if (isEmpty()) {
            return;
        } Node currNode = tail;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.prv;
        } System.out.println();
    }
    public int occur(int data) {
        int count = 0;
        if (!isEmpty()) {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.data == data) {
                    count++;
                } currNode = currNode.next;
            } 
        } return count;
    }
}