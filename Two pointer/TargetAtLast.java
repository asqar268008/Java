import java.util.*;
public class TargetAtLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {45, 78, 41, 52, 52, 63, 74, 85, 78, 96, 12, 23, 45, 45, 56, 78, 89};
        System.out.println(Arrays.toString(arr));
        int target = sc.nextInt();
        int j = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != target) {
                int temp = arr[j];
                arr[j++] = arr[i];
                arr[i] = temp;
            }
        } System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
