import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] x = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        int answer = x[N - 1];

        for (int i = 0; i < N - 1; i++) {
            answer += x[i] / 2;
        }

        System.out.println(answer);

    }

}
