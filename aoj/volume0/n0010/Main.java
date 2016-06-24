import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            double a1 = 2 * (x2 - x1);
            double b1 = 2 * (y2 - y1);
            double c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;

            double a2 = 2 * (x3 - x1);
            double b2 = 2 * (y3 - y1);
            double c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;

            double px = (b1 * c2 - c1 * b2) / (b2 * a1 - b1 * a2);
            double py = (a2 * c1 - a1 * c2) / (b2 * a1 - a2 * b1);

            double r = Math.sqrt((x1 - px) * (x1 - px) + (y1 - py) * (y1 - py));

            System.out.printf("%.3f %.3f %.3f\n", px, py, r);

        }

    }

}
