import java.util.*;
class PrimeNumberAndTwinPrimePairs {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) return false;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start and end number: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i=start; i<=end; i++) {
            if (isPrimeNumber(i)) {
                list.add(i);
            }
        } System.out.println("Prime numbers are: \n" + list);
        System.out.println("Number of prime number count is : " + list.size());
        System.out.println("Twin prime pairs are: ");
        int count = 0;
        for (int i=1; i<list.size(); i++) {
            if (list.get(i) - list.get(i-1) == 2) {
                System.out.print("(" + list.get(i-1) + "," + list.get(i) + ")");
                count++;
            }
        } System.out.println();
        System.out.println("The number of twin prime pairs count is: " + count);
    }
}
