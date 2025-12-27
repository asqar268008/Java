
import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid; 
            }
            if (arr[mid] < key) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6, 9, 12, 14, 23, 32, 45, 56, 58, 87, 90, 96, 185, 487, 564, 7454};
        Scanner sc = new Scanner(System.in);
        System.out.println("Elements in the sorted array are:" + Arrays.toString(arr));
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        } sc.close();
    }
}
