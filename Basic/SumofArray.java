package Sce;

import java.util.Scanner;
public class SumofArray {
	public static int SumOfOperation(int[] arr) {
		int sum = 0;
		for(int x:arr) {
			sum += x;
		} return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Array Length:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Sum of the Array is "+SumOfOperation(arr));
	}
}
