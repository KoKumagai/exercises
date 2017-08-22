import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                return;
            }

            int[][] matrix = new int[n + 1][n + 1];

            for (int rows = 0; rows < n; rows++) {

                for (int columns = 0; columns < n; columns++) {

                    matrix[rows][columns] = sc.nextInt();
                    matrix[rows][n] += matrix[rows][columns];
                    matrix[n][columns] += matrix[rows][columns];
                    matrix[n][n] += matrix[rows][columns];

                }

            }

            for (int rows = 0; rows < matrix.length; rows++) {

                for (int columns = 0; columns < matrix[rows].length; columns++) {
                    System.out.printf("%5d", matrix[rows][columns]);
                }

                System.out.println();

            }

        }

    }

}
