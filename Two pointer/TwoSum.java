public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8};
        int low = 0;
        int high = arr.length - 1;
        int target = 10;
        while (low < high) {
            if (arr[low] + arr[high] == target) {
                System.out.println(arr[low] + " " + arr[high]);
                break;
            } else if (arr[low] + arr[high] < target) {
                low++;
            } else {
                high--;
            }
        }
    }
}
