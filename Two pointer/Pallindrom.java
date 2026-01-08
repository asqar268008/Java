public class Pallindrom {
        public static boolean isPallindrom(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] != arr[high]) {
                return false;
            }
            low++;
            high--;
        } return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 3, 2, 1};
        System.err.println(isPallindrom(arr));
    }
}
