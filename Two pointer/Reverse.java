import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {14,89,63,45,21,47,85,96,32,52};
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        } System.out.println(Arrays.toString(arr));
    }
}
