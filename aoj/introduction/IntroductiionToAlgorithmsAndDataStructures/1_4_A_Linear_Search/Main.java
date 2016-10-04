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

            if (linearSearch(S, sc.nextInt()) != -1) {
                c++;
            }

        }

        System.out.println(c);

    }

    public static int linearSearch(int A[], int key) {

        for (int i = 0; i < A.length; i++) {

            if (A[i] == key) {
                return i;
            }

        }

        return -1;

    }

}
