import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] sheet = new int[r + 1][c + 1];

        int sum = 0;

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                int num = sc.nextInt();
                sheet[i][j] = num;
                sheet[r][j] += num;
                sheet[i][c] += num;
                sum += num;

            }

        }

        sheet[r][c] = sum;

        for (int i = 0; i < r + 1; i++) {

            for (int j = 0; j < c + 1; j++) {

                if (j < c) {
                    System.out.print(sheet[i][j] + " ");
                } else {
                    System.out.println(sheet[i][j]);
                }

            }

        }

    }

}
