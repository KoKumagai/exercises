import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        shellSort(A);

    }

    private static int insertionSort(int[] A, int g) {

        int cnt = 0;

        for (int i = g; i < A.length; i++) {

            int key = A[i];
            int j = i - g;

            while (j >= 0 && A[j] > key) {

                A[j + g] = A[j];
                j -= g;
                cnt++;

            }

            A[j + g] = key;

        }

        return cnt;

    }

    private static void shellSort(int[] A) {

        int m = 0;
        int tmp = 1;
        while (true) {
            if (tmp > A.length) {
                break;
            }
            tmp = 3 * tmp + 1;
            m++;
        }

        System.out.println(m);

        int[] G = new int[m];

        int h = 1;
        for (int i = 0; ; ) {

            if (h > A.length) {
                break;
            }

            G[i] = h;
            h = 3 * h + 1;
            i++;

        }

        int cnt = 0;
        for (int i = G.length - 1; i >= 0; i--) {

            if (i != 0) {
                System.out.print(G[i] + " ");
            } else {
                System.out.println(G[i]);
            }

            cnt += insertionSort(A, G[i]);

        }

        System.out.println(cnt);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }

}
