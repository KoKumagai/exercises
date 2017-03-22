import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] DIGITS = {{0, 1, 1, 1, 1, 1, 1},
                          {0, 0, 0, 0, 1, 1, 0},
                          {1, 0, 1, 1, 0, 1, 1},
                          {1, 0, 0, 1, 1, 1, 1},
                          {1, 1, 0, 0, 1, 1, 0},
                          {1, 1, 0, 1, 1, 0, 1},
                          {1, 1, 1, 1, 1, 0, 1},
                          {0, 1, 0, 0, 1, 1, 1},
                          {1, 1, 1, 1, 1, 1, 1},
                          {1, 1, 0, 1, 1, 1, 1}};

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            int[] current = {0, 0, 0, 0, 0, 0, 0};

            for (int i = 0; i < n; i++) {

                int[] next = DIGITS[sc.nextInt()];

                for (int segment = 0; segment < 7; segment++) {

                    System.out.print(current[segment] == next[segment] ? 0 : 1);

                }
                System.out.println();

                current = next;

            }

        }

    }

}
