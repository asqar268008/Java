import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] a = {10, 2, 5, 7, 7, 9, 20};
        int[] res = new int[a.length];
        res[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            res[i] = res[i - 1] + a[i];
        } System.out.println(Arrays.toString(res));
    }
} 
