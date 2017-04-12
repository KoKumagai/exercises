import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        long result = 1;

        for (int i = 0; i < 2017; i++) {
            result = result * 2017 * 2017 % M;
        }

        result += 2017;
        result %= M;

        System.out.println(result);

    }

}
