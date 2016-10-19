import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBrackets = sc.nextInt();
        int bracketIndexTofind = sc.nextInt();

        String s = sc.next();

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < numBrackets; i++) {

            char c = s.charAt(i);

            if (c == '(') {

                stack.add(i + 1);

            } else if (c == ')') {

                int openBracketIndex = stack.pop();

                if ((i + 1) == bracketIndexTofind) {

                    System.out.println(openBracketIndex);
                    return;

                }

                if (openBracketIndex == bracketIndexTofind) {

                    System.out.println(i + 1);
                    return;

                }

            }

        }

    }

}
