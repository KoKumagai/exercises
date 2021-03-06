import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int q = partition(A, 0, n - 1);

        for (int i = 0; i < n; i++) {

            if (q == i) {
                System.out.print("[" + A[i] + "]");
            } else {
                System.out.print(A[i]);
            }

            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }

        }

    }

    private static int partition(int[] A, int p, int r) {

        int x = A[r];

        int i = p - 1;

        for (int j = p; j < r; j++) {

            if (A[j] <= x) {

                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

            }

        }

        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return ++i;

    }

}
