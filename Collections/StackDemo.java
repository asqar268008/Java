import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.push(12);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
