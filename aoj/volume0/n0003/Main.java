import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a * a + b * b == c * c) {
                System.out.println("YES");
            } else if (a * a + c * c == b * b) {
                System.out.println("YES");
            } else if (b * b + c * c == a * a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
