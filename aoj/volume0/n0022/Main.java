import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            long sum = 0;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {

                int a = sc.nextInt();
                sum = Math.max(sum + a, a);
                max = Math.max(max, sum);

            }

            System.out.println(max);

        }

    }

}
