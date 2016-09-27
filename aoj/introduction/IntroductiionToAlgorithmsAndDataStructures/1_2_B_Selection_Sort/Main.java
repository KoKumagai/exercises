import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0 ; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int numberOfSwapOperations = selectionSort(A);

        for (int i = 0; i < N; i++) {

            if (i != N - 1) {
                System.out.print(A[i] + " ");
            } else {
                System.out.println(A[i]);
                System.out.println(numberOfSwapOperations);
            }

        }

    }

    private static int selectionSort(int[] A) {

        int numberOfSwapOperations = 0;

        for (int i = 0; i < A.length - 1; i++) {

            int min = i;

            for (int j = i; j < A.length; j++ ) {

                if (A[j] < A[min]) {
                    min = j;
                }

            }

            int tmp = A[i];
            A[i] = A[min];
            A[min] = tmp;

            if (i != min) {
                numberOfSwapOperations++;
            }

        }

        return numberOfSwapOperations;

    }

}
