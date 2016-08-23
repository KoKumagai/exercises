import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();
            String operator = sc.next();
            int b = sc.nextInt();

            if (operator.equals("?")) {
                break;
            }

            if (operator.equals("+")) {

                System.out.println(a + b);

            } else if (operator.equals("-")) {

                System.out.println(a - b);

            } else if (operator.equals("*")) {

                System.out.println(a * b);

            } else if (operator.equals("/")) {

                System.out.println(a / b);

            }

        }

    }

}
