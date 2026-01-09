public class SumNeighbourElement {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 9, 6};
        int w_s = 2;
        int sum = 0;
        for (int i = 0; i < w_s; i++) {
            sum += arr[i];
        } System.out.println(sum);
        for (int i = w_s; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - w_s];
            System.out.println(sum);
        }
    }
}