public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 9, 6, 4, 9, 7, 1, 5};
        int w_s = 2;
        int sum = 0;
        int min, max;
        for (int i = 0; i < w_s; i++) {
            sum += arr[i];
        } min = max = sum;
        for (int j = w_s; j < arr.length; j++) {
            sum = sum + arr[j] - arr[j - w_s];
            if (sum > max) {
                max = sum;
            } if (sum < min) {
                min = sum;
            } 
        } 
        System.out.println("Max: " + max + "\n" + "Min: " + min);
    }
}
