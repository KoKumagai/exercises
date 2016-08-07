import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            long num = sc.nextLong();
            int[][] triangle = new int[10][10];

            for (int i = 9; i >= 0; i--) {

                triangle[0][i] = (int) (num % 10);
                num /= 10;

            }

            for (int i = 0; i < 9; i++) {

                for (int j = 0; j < 9 - i; j++) {

                    triangle[i + 1][j] = (triangle[i][j] + triangle[i][j + 1]) % 10;

                }

            }

            System.out.println(triangle[9][0]);

        }

    }

}
