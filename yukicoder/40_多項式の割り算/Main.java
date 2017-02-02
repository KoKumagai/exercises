import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();

        int[] a = new int[D + 1];

        for (int i = 0; i <= D; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = D; 3 <= i; i--) {

            a[i - 2] += a[i];
            a[i] = 0;

        }

        int degree = 0;

        for (int i = D; 0 <= i; i--) {

            if (a[i] != 0) {
                degree = i;
                break;
            }

        }

        System.out.println(degree);

        for (int i = 0; i <= degree; i++) {

            if (0 < i) {
                System.out.print(' ');
            }

            System.out.print(a[i]);

        }

    }

}
