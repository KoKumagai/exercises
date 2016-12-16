import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] =  sc.nextInt();
        }

        Arrays.sort(A);

        double median;

        if ((N % 2) == 0) {

            int midpoint1 = A[N / 2 - 1];
            int midpoint2 = A[N / 2];

            median = (double) (midpoint1 + midpoint2) / 2;

        } else {

            median = A[N / 2];

        }

        System.out.println(median);

    }

}
