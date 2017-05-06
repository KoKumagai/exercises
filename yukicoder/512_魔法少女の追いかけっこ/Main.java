import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kobaSpeed = sc.nextInt();
        int masterSpeed = sc.nextInt();
        int N = sc.nextInt();

        int[] times = new int[N];

        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {

            if (times[i] * masterSpeed > times[i + 1] * kobaSpeed) {
                System.out.println("NO");
                return;
            }

        }

        System.out.println("YES");

    }

}
