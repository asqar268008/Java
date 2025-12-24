import java.util.Scanner;

public class cashback {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bill = s.nextInt();
        if (bill >= 1000) {
            System.out.println("You have Cashback");
        } else {
            System.out.println("No Cashback");
        }
    }
}
