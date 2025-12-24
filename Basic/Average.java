import java.util.Scanner;
public class Average {
   public static void main(String[] args) {
        System.out.println("Enter three subject marks");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int Average = (num1 + num2 + num3) / 3;
        if (Average >= 90) {
            System.out.println("Grade A");
        } else if (Average >= 75 && Average <= 89) {
            System.out.println("Grade B");
        } else if (Average >= 60 && Average <= 74) {
            System.out.println("Grade C");
        } else if (Average >= 40 && Average <= 59) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
   } 
}
