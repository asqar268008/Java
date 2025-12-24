
import java.util.Scanner;

public class pointIntersect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else {
            System.out.println("Not Origin");
        }
    }
}
