import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

        long y = 1;

        for (long i = 2; (i * i) <= x; i++) {

            int factorCount = 0;

            while (x % i == 0) {

                x /= i;
                factorCount++;

            }

            if (factorCount % 2 != 0) {
                y *= i;
            }

        }

        if (x > 1) {
            y *= x;
        }

        System.out.println(y);

    }

}
