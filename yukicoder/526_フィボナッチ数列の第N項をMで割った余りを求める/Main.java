import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long F[] = new long[N + 1];

        F[1] = 0;
        F[2] = 1;

        for (int i = 3; i < N + 1; i++) {
            F[i] = (F[i - 2] + F[i - 1]) % M;
        }

        System.out.println(F[N]);

    }

}
