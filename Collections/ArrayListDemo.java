import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add(0, "C");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Asqar");
        list2.addAll(list1);
        System.out.println(list2);

        list1.clear();
        System.out.println(list1.isEmpty());

        System.out.println(list2.contains("Asqar"));
        System.out.println(list2.get(2));

        list2.set(1, "Safeer"); //replace
        list2.remove(3);
        System.out.println(list2.iterator());

        System.out.println(list2);
        System.out.println(list2.indexOf("Asqar")); //If duplicate, first occurance of specified element
        System.out.println(list2.lastIndexOf("Java")); //if duplicate, last occurannce of specified element
        System.out.println(list2.size());
  }
}