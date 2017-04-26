import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long D = sc.nextLong();

        System.out.println(N / gcd(N, D) - 1);

    }

    private static long gcd(long a, long b) {

        while (b > 0) {

            long remainder = a % b;
            a = b;
            b = remainder;

        }

        return a;

    }

}
