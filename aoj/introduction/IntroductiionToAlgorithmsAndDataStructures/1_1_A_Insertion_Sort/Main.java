import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        insertionSort(A);

    }

    public static void insertionSort(int[] A) {

        for (int i = 0; i < A.length; i++) {

            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {

                A[j + 1] = A[j];
                j--;

            }

            A[j + 1] = key;
            print(A);

        }

    }

    public static void print(int[] A) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < A.length; i++) {
            builder.append(A[i] + " ");
        }

        System.out.println(builder.toString().trim());

    }

}
