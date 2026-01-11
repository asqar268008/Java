public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(0);
        list.display();
        list.addLast(20);
        list.addLast(25);
        list.addLast(30);
        list.addLast(40);
        list.display();
        list.addAtPosition(2, 7);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtPosition(2);
        list.display();
        list.deleteElement(7);
        list.display();
        System.out.println(list.search(7));
        System.out.println(list.length());
        System.out.println(list.isEmpty());
        System.out.println(list.occur(20));
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
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            } currNode.next = newnNode;
        }
    }
    public void addAtPosition(int pos, int data) {
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
        currNode.next = newNode;
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        } currNode.next = null;
    }
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is Empty");
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
    }
    public void deleteElement(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } if (head.data == data) {
            head = head.next;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            if (currNode.next.data == data) {
                currNode.next = currNode.next.next;
                return;
            } currNode = currNode.next;
        } System.out.println("Element is not Found");
    }
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } Node currNode = head;
        int temp = 0;
        while (currNode != null) {
            if (temp == 0) {
                System.out.print(currNode.data);
                currNode = currNode.next;
                temp++;
            } else {
                System.out.print("-->" + currNode.data);
                currNode = currNode.next;
            }
        } System.out.println();
    }
    public boolean search(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return false;
        } Node curNode = head;
        while (curNode != null) {
            if (curNode.data == data) {
                return true;
            } curNode = curNode.next;
        } return false;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int length() {
        if (head == null) {
            return 0;
        } Node currNode = head;
        int count = 0;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        } return count;
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