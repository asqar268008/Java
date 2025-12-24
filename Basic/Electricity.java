
import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int units = s.nextInt();
        if (units <= 100) {
            System.out.println(units * 2.0);
        } else if (units <= 200) {
            System.err.println(units * 3.5);
        } else {
            System.out.println(units * 5.0);
        }
    }
}
