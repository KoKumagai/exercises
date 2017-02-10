import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            double aX = sc.nextDouble();
            double aY = sc.nextDouble();
            double bX = sc.nextDouble();
            double bY = sc.nextDouble();

            double cX = sc.nextDouble();
            double cY = sc.nextDouble();
            double dX = sc.nextDouble();
            double dY = sc.nextDouble();

            double slope1 = (bY - aY) / (bX - aX);
            double slope2 = (dY - cY) / (dX - cX);

            System.out.println(slope1 == slope2 ? "YES" : "NO");

        }

    }

}
