import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int count = 0;

        while (M != N) {

            count++;

            if (N < M) {

                M -= N;

            } else {

                int tmp = M;
                M = N;
                N = tmp;

            }

        }

        if (M == 0 || N == 0) {
            count = -1;
        }

        System.out.println(count);

    }

}
