import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int a1 = sc.nextInt();
            int m1 = sc.nextInt();
            int a2 = sc.nextInt();
            int m2 = sc.nextInt();
            int a3 = sc.nextInt();
            int m3 = sc.nextInt();

            if (a1 == 0 && a2 == 0 && a3 == 0 && m1 == 0 && m2 == 0 && m3 == 0) {
                break;
            }

            long x = 1;
            long countX = 0;

            long y = 1;
            long countY = 0;

            long z = 1;
            long countZ = 0;

            while (true) {

                x = a1 * x % m1;
                countX++;

                if (x == 1) {
                    break;
                }

            }

            while (true) {

                y = a2 * y % m2;
                countY++;

                if (y == 1) {
                    break;
                }

            }

            while (true) {

                z = a3 * z % m3;
                countZ++;

                if (z == 1) {
                    break;
                }

            }

            long lcm1 = lcm(countX, countY);
            long lcm2 = lcm(countZ, lcm1);

            System.out.println(lcm2);

        }

    }

    private static long gcd(long x, long y) {

        if (x < y) {

            long tmp = x;
            x = y;
            y = tmp;

        }

        while (y != 0) {

            long r = x % y;
            x = y;
            y = r;

        }

        return x;

    }

    private static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

}
