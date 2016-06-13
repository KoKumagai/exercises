import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            int digit_number = 0;
            while (sum > 0) {
                sum /= 10;
                digit_number++;
            }

            System.out.println(digit_number);

        }

    }

}
