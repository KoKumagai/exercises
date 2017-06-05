import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 0 || K > N) {
            System.out.println(0);
            return;
        }

        if (N % 2 == 1 && K == (N + 1) / 2) {
            System.out.println(N - 1);
        } else {
            System.out.println(N - 2);
        }

    }

}
