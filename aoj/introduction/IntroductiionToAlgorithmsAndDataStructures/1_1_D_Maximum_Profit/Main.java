import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] R = new int[n];

        for (int i = 0 ; i < n ; i++) {
            R[i] = sc.nextInt();
        }

        int max = -1000000000;
        int min = R[0];

        for (int i = 1; i < n; i++) {

            if (max < R[i] - min) {
                max = R[i] - min;
            }

            if (min > R[i]) {
                min = R[i];
            }

        }

        System.out.println(max);

    }

}
