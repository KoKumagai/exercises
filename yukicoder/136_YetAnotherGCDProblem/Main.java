import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = N - 1; i >= 1; i--) {

            if (N % i == 0) {
                System.out.println(i);
                break;
            }

        }

    }

}
