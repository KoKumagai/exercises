import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int operand = 0;
        int answer = 0;
        char operation = ' ';

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if ('0' <= c && c <= '9') {

                operand = operand * 10 + c - '0';

            } else if (c == '*'  || c == '+') {

                if (operation == '*' || operation == ' ') {

                    answer += operand;
                    operand = 0;
                    operation = c;

                } else if (operation == '+') {

                    answer *= operand;
                    operand = 0;
                    operation = c;

                }

            }

        }

        if (operation == '*') {
            answer += operand;
        } else if (operation == '+'){
            answer *= operand;
        }

        System.out.println(answer);

    }

}
