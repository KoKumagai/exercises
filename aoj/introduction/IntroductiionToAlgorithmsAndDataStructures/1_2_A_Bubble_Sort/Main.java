import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0 ; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int numberOfSwapOperations = bubbleSort(A);

        for (int i = 0; i < N; i++) {

            if (i != N - 1) {
                System.out.print(A[i] + " ");
            } else {
                System.out.println(A[i]);
                System.out.println(numberOfSwapOperations);
            }

        }

    }

    private static int bubbleSort(int[] A) {

        int numberOfSwapOperations = 0;
        boolean flag = true;

        while (flag) {

            flag = false;

            for (int i = A.length - 1; i >= 1; i--) {

                if (A[i] < A[i - 1]) {

                    int tmp = A[i];
                    A[i] = A[i - 1];
                    A[i - 1] = tmp;
                    flag = true;
                    numberOfSwapOperations++;

                }

            }

        }

        return numberOfSwapOperations;

    }

}
