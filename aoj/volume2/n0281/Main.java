import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        for (int i = 0; i < year; i++) {

            int coder = sc.nextInt();
            int algorithmar = sc.nextInt();
            int navigator = sc.nextInt();

            int team = 0;

            while (1 <= coder && 1 <= algorithmar && 1 <= navigator) {

                team++;

                coder--;
                algorithmar--;
                navigator--;

            }

            while (2 <= coder && 1 <= algorithmar) {

                team++;

                coder -= 2;
                algorithmar -= 1;

            }

            while (3 <= coder) {

                team++;

                coder -= 3;

            }

            System.out.println(team);

        }

    }

}
