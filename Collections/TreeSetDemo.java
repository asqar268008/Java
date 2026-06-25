import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> hash = new TreeSet<>();
        hash.add(14);
        hash.add(17);
        hash.add(15);
        hash.add(16);
        hash.add(15);
        hash.add(18);
        hash.add(19);
        hash.add(10);
        hash.add(9);
        System.out.println(hash);
        hash.remove(15);
        System.out.println(hash);
        System.out.println(hash.contains(15));

        System.out.println(hash.first());
        System.out.println(hash.last());
        System.out.println(hash.higher(16));
        System.out.println(hash.lower(16));
        System.out.println(hash.ceiling(14));
        System.out.println(hash.floor(17));
        hash.pollFirst();
        hash.pollLast();
        System.out.println(hash);
    }
}
