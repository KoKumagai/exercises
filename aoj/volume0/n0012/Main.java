import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()) {

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            double xp = sc.nextDouble();
            double yp = sc.nextDouble();

            double crossProduct1 = (x2 - x1) * (yp - y1) - (y2 - y1) * (xp - x1);

            double crossProduct2 = (x3 - x2) * (yp - y2) - (y3 - y2) * (xp - x2);

            double crossProduct3 = (x1 - x3) * (yp - y3) - (y1 - y3) * (xp - x3);

            if ((0 < crossProduct1 && 0 < crossProduct2 && 0 < crossProduct3) || (crossProduct1 < 0 && crossProduct2 < 0 && crossProduct3 < 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
