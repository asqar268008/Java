import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Array Length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=1;i<n;i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j -= 1;
            } arr[j+1] = key;
        } System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
