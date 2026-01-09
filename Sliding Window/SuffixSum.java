import java.util.Arrays;
public class SuffixSum {
    public static void main(String[] args) {
        int[] a = {10, 2, 5, 9, 9, 8};
        int[] res = new int[a.length];
        res[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            res[i] = res[i + 1] + a[i];
        } System.out.println(Arrays.toString(res));
    }
}
