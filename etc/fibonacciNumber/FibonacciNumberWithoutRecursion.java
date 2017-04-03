import java.util.Scanner;

public class FibonacciNumberWithoutRecursion {

    private static int fibonacciNumber(int num) {

        if (num == 1 || num == 2) {
            return 1;
        }

        int first = 1;
        int second = 1;

        int fibonacciNumber = 0;

        for (int i = 3; i <= num; i++) {

            fibonacciNumber = first + second;
            first = second;
            second = fibonacciNumber;

        }

        return fibonacciNumber;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number upto Fibonacci numbers to print : ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(fibonacciNumber(i));
        }

    }

}
