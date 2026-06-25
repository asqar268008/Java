import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(14);
        hash.add(15);
        hash.add(16);
        hash.add(17);
        hash.add(15);
        System.out.println(hash);
        hash.remove(15);
        System.out.println(hash);
        System.out.println(hash.contains(15));
    }
}
