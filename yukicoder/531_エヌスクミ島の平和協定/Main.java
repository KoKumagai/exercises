import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N <= M) {
            System.out.println(1);
            return;
        }

        if (N % 2 == 0 && N / 2 <= M) {
            System.out.println(2);
        } else {
            System.out.println(-1);
        }

    }

}
