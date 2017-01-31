import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        int count = 0;

        for (long i = 2; i < Math.sqrt(N); i++) {

            if (N % i == 0) {
                count++;
            }

            if (N % (i * i) == 0) {
                count++;
            }

        }

        System.out.println(1 < count ? "YES" : "NO");

    }

}
