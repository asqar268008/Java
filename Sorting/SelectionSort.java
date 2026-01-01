import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Array Length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			int min_index = i;
			for (int j=i+1;j<n;j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			int temp = arr[i];
			arr[i] = arr[min_index];	
			arr[min_index] = temp;
			}
		} System.out.println("Sorted Array is: " + Arrays.toString(arr));
		sc.close();
	}
}
