import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> dict = new LinkedHashMap<>();
        dict.put("A", 5);
        dict.putFirst("B", 6);
        dict.put("C", 7);
        dict.put("D", 8);
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
    }
}

