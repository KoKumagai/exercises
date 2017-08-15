import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            double x = 1;
            double y = 0;

            double r = Math.PI;

            for (int i = 2; i <= n; i++) {

                r -= Math.PI / 2;

                x += Math.cos(r);
                y += Math.sin(r);

                r = Math.atan2(y, x) - Math.PI;

            }

            System.out.println(x);
            System.out.println(y);

        }

    }

}
