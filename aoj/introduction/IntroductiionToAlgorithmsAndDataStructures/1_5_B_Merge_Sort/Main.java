import java.util.Scanner;

public class Main {

    private static int count;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] S = new int[n];

        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }

        mergeSort(S, 0, n);

        for(int i = 0; i < n; i++) {

            if (i != n - 1) {
                System.out.print(S[i] + " ");
            } else {
                System.out.println(S[i]);
            }

        }

        System.out.println(count);

    }

    private static void mergeSort(int[] S, int left, int right) {

        if (left + 1 < right) {

            int mid = (left + right) / 2;

            mergeSort(S, left, mid);
            mergeSort(S, mid, right);
            merge(S, left, mid, right);

        }

    }

    private static void merge(int[] S, int left, int mid, int right) {

        int n1 = mid - left;
        int n2 = right - mid;

        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        for (int i = 0; i < n1; i++){
            L[i] = S[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = S[mid + i];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {

            if (L[i] <= R[j]) {

                S[k] = L[i];
                i++;

            } else {

                S[k] = R[j];
                j++;

            }

            count++;

        }

    }

}
