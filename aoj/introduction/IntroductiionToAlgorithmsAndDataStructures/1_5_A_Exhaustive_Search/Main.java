import java.util.Scanner;

public class Main {

    private static int n;
    private static int[] A;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int m = sc.nextInt();

            System.out.println(solve(0, m) ? "yes" : "no");

        }

    }

    private static boolean solve(int i, int m) {

        if (m == 0) {
            return true;
        }

        if (i >= n ) {
            return false;
        }

        return solve(i + 1, m) || solve(i + 1, m - A[i]);

    }

}
