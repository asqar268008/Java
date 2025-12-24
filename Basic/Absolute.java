
import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number < 0) {
            number = -number;
        }
        System.out.println("Absolute value: " + number);
    } 
}