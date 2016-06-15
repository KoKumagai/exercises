import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();

            double x = (double) (c * e - b * f) / (a * e - b * d);
            double y = (double) (c - a * x) / b;

            if(x == -0.0) {
                x = 0.0;
            }

            if (y == -0.0) {
                y = 0.0;
            }

            System.out.printf("%.3f %.3f\n", x, y);

        }

    }

}
