import java.util.Scanner;

public class Main {

    private static final double EPS = 1e-10; // 0.0000000001

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            double ax = sc.nextDouble();
            double ay = sc.nextDouble();
            double bx = sc.nextDouble();
            double by = sc.nextDouble();
            double cx = sc.nextDouble();
            double cy = sc.nextDouble();
            double dx = sc.nextDouble();
            double dy = sc.nextDouble();

            double xab = ax - bx;
            double yab = ay - by;
            double xcd = cx - dx;
            double ycd = cy - dy;

            if (xab * xcd + yab * ycd <  EPS &&
                xab * xcd + yab * ycd > -EPS   ) {

                System.out.println("YES");

            } else {

                System.out.println("NO");

            }

        }

    }

}
