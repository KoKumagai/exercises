import java.util.Scanner;

public class Main {

    public static long gcd(long a, long b) {

        long tmp = a % b;

        while (tmp != 0) {

            a = b;
            b = tmp;
            tmp = a % b;

        }

        return b;

    }

    public static long lcm(long a, long b) {

        return a * b / gcd(a, b);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(gcd(a, b) + " " + lcm(a, b));

        }

    }

}
