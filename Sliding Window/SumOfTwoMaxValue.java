public class SumOfTwoMaxValue {
    public static void main(String[] args) {
        int[] arr = {-1, 10, -2, 10, -50};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            } if (sum > max) {
                max = sum;
            } 
        } System.out.println(max);
    }
}
