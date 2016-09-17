import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] x = new double[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double pInfinity = 0;

        for (int i = 0; i < n; i++) {

            double y = sc.nextDouble();
            double z = Math.abs(x[i] - y);

            p1 += z;
            p2 += Math.pow(z, 2);
            p3 += Math.pow(z, 3);
            pInfinity = Math.max(pInfinity, z);

        }

        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(pInfinity);

    }

}
