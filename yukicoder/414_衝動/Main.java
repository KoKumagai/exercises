import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long M = sc.nextLong();

        for (long i = 2; (i * i) <= M; i++) {

            if (M % i == 0) {
                System.out.println(i + " " + (M / i));
                return;
            }

        }

        System.out.println(1 + " " + M);

    }

}
