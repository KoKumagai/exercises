import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int gcd = 100;

        for (int i = 0; i < n; i++) {

            gcd = gcd(gcd, sc.nextInt());

        }

        System.out.println(100 / gcd);

    }

    private static int gcd(int a, int b) {

        while (b > 0) {

            int remainder = a % b;
            a = b;
            b = remainder;

        }

        return a;

    }

}
