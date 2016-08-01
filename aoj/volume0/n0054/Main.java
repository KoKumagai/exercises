import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;

            a %= b;

            for (int i = 0; i < n; i++) {
                sum += a * 10 / b;
                a = a * 10 % b;
            }

            System.out.println(sum);

        }

    }

}
