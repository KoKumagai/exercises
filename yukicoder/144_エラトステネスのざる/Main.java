import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double P = sc.nextDouble();

        double[] primes = new double[N + 1];
        double answer = 0;

        for (int i = 2; i <= N; i++) {

            answer += Math.pow(1 - P, primes[i]);

            for (int j = i * 2; j <= N; j += i) {
                primes[j]++;
            }

        }

        System.out.println(answer);

    }

}
