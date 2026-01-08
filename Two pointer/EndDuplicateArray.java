import java.util.*;
public class EndDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 8, 9, 10, 10};
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } System.out.println(Arrays.toString(arr));
        for (int k = 0; k<i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
