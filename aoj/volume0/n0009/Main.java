import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isPrime[] = new boolean[1000000];
        int numberOfPrime[] = new int[1000000];

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i < 1000000; i++) {
            isPrime[i] = true;
        }

        Arrays.fill(numberOfPrime, 0);

        for (int i = 2; i < 1000000; i++) {

            if (isPrime[i] == true) {

                numberOfPrime[i] = numberOfPrime[i - 1] + 1;

                for (int j = i + i; j < 1000000; j += i) {
                    isPrime[j] = false;
                }

            } else {

                numberOfPrime[i] = numberOfPrime[i - 1];

            }

        }

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            System.out.println(numberOfPrime[sc.nextInt()]);
        }

    }

}
