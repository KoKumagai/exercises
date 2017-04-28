import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MOD = 1_000_003;

        int x = sc.nextInt();
        int N = sc.nextInt();

        long answer = 0;

        for (int i = 0; i < N; i++) {

            int a = sc.nextInt();

            answer += powMod(x, a, MOD);

        }

        answer %= MOD;

        System.out.println(answer);

    }

    private static long powMod(int base, int exponent, int mod) {

        long result = 1;

        if (exponent != 0) {

            result = powMod(base, exponent / 2, mod);

            if (exponent % 2 == 0) {
                result = (result * result) % mod;
            } else {
                result = (((result * result) % mod) * base) % mod;
            }

        }

        return result;

    }

}
