import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        int k = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            A[i] = sc.nextInt();

            if (k < A[i]) {
                k = A[i];
            }

        }

        countingSort(A, B, k);

        sb.append(B[0]);
        for (int i = 1; i < B.length; i++) {
            sb.append(" " + B[i]);
        }

        System.out.println(sb.toString());

    }

    private static void countingSort(int[] A, int[] B, int k) {

        int C[] = new int[k + 1];

        for (int i = 0; i < A.length; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            C[i] += C[i - 1];
        }

        for (int i = A.length - 1; i >= 0; i--) {

            C[A[i]]--;
            B[C[A[i]]] = A[i];

        }

    }

}
