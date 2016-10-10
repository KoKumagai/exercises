import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Point a = new Point(0, 0);
        Point b = new Point(100, 0);

        System.out.printf("%.8f %.8f\n", a.getX(), a.getY());

        koch(n, a, b);

        System.out.printf("%.8f %.8f\n", b.getX() , b.getY());

    }

    private static void koch(int n, Point a, Point b) {

        if (n == 0) {
            return;
        }

        double x;
        double y;

        x = (2.0 * a.getX() + 1.0 * b.getX()) / 3.0;
        y = (2.0 * a.getY() + 1.0 * b.getY()) / 3.0;
        Point s = new Point(x, y);

        x = (1.0 * a.getX() + 2.0 * b.getX()) / 3.0;
        y = (1.0 * a.getY() + 2.0 * b.getY()) / 3.0;
        Point t = new Point(x, y);

        double sine60 = Math.sin(Math.toRadians(60));;
        double cosine60 = Math.cos(Math.toRadians(60));

        double diffX = t.getX() - s.getX();
        double diffY = t.getY() - s.getY();

        x = diffX * cosine60 - diffY * sine60 + s.getX();
        y = diffX * sine60 + diffY * cosine60 + s.getY();
        Point u = new Point(x, y);

        koch(n -  1, a, s);
        System.out.printf("%.8f %.8f\n", s.getX(), s.getY());

        koch(n -  1, s, u);
        System.out.printf("%.8f %.8f\n", u.getX(), u.getY());

        koch(n -  1, u, t);
        System.out.printf("%.8f %.8f\n", t.getX(), t.getY());

        koch(n -  1, t, b);

    }

}

class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

}
