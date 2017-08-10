import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> primes = new ArrayList<Integer>();

        int primeNumberMax = 104_729; // 10,000 prime number is 104,729

        for (int i = 2; i <= primeNumberMax; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                primes.add(i);
            }

        }

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += primes.get(i);
            }

            System.out.println(sum);

        }

    }

}
