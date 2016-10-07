import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] w = new int[100000];

        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        System.out.println(solve(n, k, w));

    }

    private static int solve(int n, int k, int[] w) {

        int left = 0;
        int right = 100000 * 10000;

        while (right - left > 1) {

            int mid = (left + right) / 2;

            int v = check(mid, n, k, w);

            if (v >= n) {
                right = mid;
            } else {
                left = mid;
            }

        }

        return right;

    }

    private static int check(int p, int n, int k, int[] w) {

        int i = 0;

        for (int j = 0; j < k; j++) {

            int s = 0;

            while (s + w[i] <= p) {

                s += w[i];
                i++;

                if (i == n) {
                    return n;
                }

            }

        }

        return i;

    }

}
