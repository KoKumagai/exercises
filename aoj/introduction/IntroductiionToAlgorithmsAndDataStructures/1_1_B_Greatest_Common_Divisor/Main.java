import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x, y));

    }

    private static int gcd(int x, int y) {

        if (x < y) {

            int tmp = x;
            x = y;
            y = tmp;

        }

        while (x % y != 0) {

            int tmp = x % y;
            x = y;
            y = tmp;

        }

        return y;

    }

}
