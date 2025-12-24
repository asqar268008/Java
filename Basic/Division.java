import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(num1 / num2);    
        }
    }
}