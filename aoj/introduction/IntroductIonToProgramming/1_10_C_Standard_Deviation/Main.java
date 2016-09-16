import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            double[] s = new double[n];
            double sum = 0;

            for (int i = 0; i < n; i++) {
                s[i] = sc.nextDouble();
                sum += s[i];
            }

            double m = sum / n;

            double variance = 0;
            for (int i = 0; i < n; i++) {
                variance += (s[i] - m) * (s[i] - m) / n;
            }

            System.out.println(Math.sqrt(variance));

        }

    }

}
