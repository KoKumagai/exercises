import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(mergeSort(A, 0, n));

    }

    private static long mergeSort(int[] A, int left, int right) {

        if (left + 1 < right) {

            int mid = (left + right) / 2;

            long v1 = mergeSort(A, left, mid);
            long v2 = mergeSort(A, mid, right);
            long v3 = merge(A, left, mid, right);

            return v1 + v2 + v3;

        } else {

            return 0;

        }

    }

    private static long merge(int[] A, int left, int mid, int right) {

        int n1 = mid - left;
        int n2 = right - mid;

        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        for (int i = 0; i < n1; i++){
            L[i] = A[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        long count = 0;
        for (int k = left; k < right; k++) {

            if (L[i] <= R[j]) {

                A[k] = L[i];
                i++;

            } else {

                A[k] = R[j];
                j++;
                count += n1 - i;  // = mid + j - k - 1

            }

        }

        return count;

    }

}
