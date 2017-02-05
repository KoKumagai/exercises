import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] PATTERNS = {{0, 1, 2}, {1, 2, 0}, {2, 0, 1}};

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {

            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

        }

        for (int i = 0; i < 3; i++) {

            int x1 = x[PATTERNS[i][0]];
            int y1 = y[PATTERNS[i][0]];

            int x2 = x[PATTERNS[i][1]];
            int y2 = y[PATTERNS[i][1]];

            int x3 = x[PATTERNS[i][2]];
            int y3 = y[PATTERNS[i][2]];

            if ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) == (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)) {

                if ((x1 - x2) * (x2 - x3) + (y1 - y2) * (y2 - y3) == 0) {

                    int x4 = x3 + x1 - x2;
                    int y4 = y3 + y1 - y2;

                    System.out.println(x4 + " " + y4);
                    return;

                }

            }

        }

        System.out.println(-1);

    }

}
