import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.addFirst(0);
        list.addLast(11);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAll(list);
        list2.add(15);
        list2.add(25);
        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);

        System.out.println(list2.get(3));
        list2.set(3, 20);
        System.out.println(list2.contains(20));
        System.out.println(list2.offer(1));
        System.out.println(list2);
        System.out.println(list2.poll());
        System.out.println(list2);
    }
}
