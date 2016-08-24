import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 1000000;
        int max = -1000000;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();

            sum += a;

            if (a < min) {
                min = a;
            }

            if (max < a) {
                max = a;
            }

        }

        System.out.println(min + " " + max + " " + sum);

    }

}
