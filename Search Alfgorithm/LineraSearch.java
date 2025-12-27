import java.util.*;
public class LineraSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {45,487,56,96,32,14,58,9,6,7454,872,185,564,23,87,12,90};
        System.out.println("Elements in the array are:" + Arrays.toString(arr));
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        } sc.close();
    }
}