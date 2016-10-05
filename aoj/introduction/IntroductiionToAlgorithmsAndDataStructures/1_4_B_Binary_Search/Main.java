import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] S = new int[n];

        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        int c = 0;

        for (int i = 0; i < q; i++) {

            if (binarySearch(S, sc.nextInt()) != -1) {
                c++;
            }

        }

        System.out.println(c);

    }

    public static int binarySearch(int A[], int key) {

        int low = 0;
        int high = A.length - 1;

        while (low <= high) {

            int mid = (high - low) / 2 + low;

            if (A[mid] == key) {
                return mid;
            }

            if (A[low] <= A[mid]) {

                if (key < A[mid] && key >= A[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {

                if (key > A[mid] && key <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }

        }

        return -1;

    }

}
