import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double C = Math.toRadians(sc.nextDouble());

        double h = b * Math.sin(C);

        double S = a * h / 2;

        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C));
        double L = a + b + c;

        System.out.println(S + " " + L + " " + h);

    }

}
