import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] S = new String[N];
        String[] T = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {
            T[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {

            if (!S[i].equals(T[i])) {

                System.out.println(i + 1);
                System.out.println(S[i]);
                System.out.println(T[i]);
                break;

            }

        }

    }

}
