import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        long lcmAB = lcm(a, b);
        long lcmBC = lcm(b, c);
        long lcmCA = lcm(c, a);

        long lcmABC = lcm(lcmAB, c);

        long answer = (N / a) + (N / b) + (N / c) + (N / lcmABC) - (N / lcmAB) - (N / lcmBC) - (N / lcmCA);

        System.out.println(answer);

    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
