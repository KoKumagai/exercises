import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int house[][][] = new int[4][3][10];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            house[b - 1][f - 1][r - 1] += v;

        }

        for (int i = 0; i < house.length; i++) {

            for (int j = 0; j < house[i].length; j++) {

                for (int k = 0; k < house[i][j].length; k++) {

                    System.out.print(" " + house[i][j][k]);

                }

                System.out.println();

            }

            if (i < house.length - 1) {
                System.out.println("####################");
            }

        }

    }

}
