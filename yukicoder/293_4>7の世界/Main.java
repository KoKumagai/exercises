import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        if (A.length > B.length) {
            System.out.println(A);
            return;
        } else if (A.length < B.length) {
            System.out.println(B);
            return;
        }

        for (int i = 0; i < A.length; i++) {

            if (A[i] != B[i]) {

                if (A[i] == '4' && B[i] == '7') {
                    System.out.println(A);
                    break;
                } else if (A[i] == '7' && B[i] == '4') {
                    System.out.println(B);
                    break;
                }

                if (A[i] > B[i]) {
                    System.out.println(A);
                    break;
                } else if (A[i] < B[i]) {
                    System.out.println(B);
                    break;
                }

            }

        }

    }

}
