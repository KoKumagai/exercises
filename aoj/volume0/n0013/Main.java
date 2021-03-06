import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        while (sc.hasNextInt()) {

            int number = sc.nextInt();

            if (number == 0) {
                System.out.println(stack.pop());
            } else {
                stack.push(number);
            }

        }

    }

}
