import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int[] customers = new int[n];

            for (int i = 0; i < n; i++) {
                customers[i] = sc.nextInt();
            }

            Arrays.sort(customers);

            long time = 0;
            long sum = 0;

            for (int i = 0; i < n - 1; i++) {
                time += customers[i];
                sum += time;
            }

            System.out.println(sum);

        }

    }

}
