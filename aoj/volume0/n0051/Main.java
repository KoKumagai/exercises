import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            char[] numbers = sc.next().toCharArray();

            Arrays.sort(numbers);

            int min = 0;
            int max = 0;

            int minDigit = 10000000;
            int maxDigit = 1;

            for (int j = 0; j < 8; j++) {

                int number = numbers[j] - '0';

                min += number * minDigit;
                max += number * maxDigit;

                minDigit /= 10;
                maxDigit *= 10;

            }

            System.out.println(max - min);

        }

    }

}
