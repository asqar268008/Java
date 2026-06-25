import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> dict = new TreeMap<>();
        dict.put("C", 5);
        dict.put("A", 6);
        dict.put("D", 7);
        dict.put("B", 8);
        dict.putIfAbsent("D", 9); //already D is present so can't be replace
        System.out.println(dict);
        System.out.println(dict.get("C"));
        System.out.println(dict.containsKey("E"));
        System.out.println(dict.containsValue(8));
        System.out.println(dict.keySet());
        System.out.println(dict.values());
        dict.replace("D", 9);
        dict.remove("A");
        System.out.println(dict.getOrDefault("A", 89));

        System.out.println(dict.firstKey());
        System.out.println(dict.lastKey());
        System.out.println(dict.firstEntry());
        System.out.println(dict.lastEntry());
        System.out.println(dict.higherKey("A"));
        System.out.println(dict.lowerKey("D"));
    }
}
