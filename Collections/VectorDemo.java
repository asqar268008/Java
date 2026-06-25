import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<>(); 
        v.add(1.00);
        v.add(3.14);
        System.out.println(v);

        Vector<Double> v2 = new Vector<>(); 
        v2.add(8.96);
        v2.add(8.29);
        v2.addAll(0, v);
        System.out.println(v2);
        v2.set(2, 8.21);
        System.out.println(v2.get(3));
        System.out.println(v2.equals(v));
        System.out.println(v2.retainAll(v));
    }
}
