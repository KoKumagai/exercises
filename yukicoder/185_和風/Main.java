import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int xFirst = sc.nextInt();
        int yFirst = sc.nextInt();

        int answer = yFirst - xFirst;

        if (answer <= 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < n - 1; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (answer != y - x) {
                System.out.println(-1);
                return;
            }

        }

        System.out.println(answer);

    }

}
