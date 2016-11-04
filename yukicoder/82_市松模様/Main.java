import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int WIDTH = sc.nextInt();
        int HEIGHT = sc.nextInt();
        char FIRST_LETTER = sc.next().charAt(0);

        char[] pattern = new char[2];

        if (FIRST_LETTER == 'B') {
            pattern[0] = 'B';
            pattern[1] = 'W';
        } else if (FIRST_LETTER == 'W') {
            pattern[0] = 'W';
            pattern[1] = 'B';
        }

        for (int i = 0; i < HEIGHT; i++) {

            for (int j = 0; j < WIDTH; j++) {

                System.out.print(pattern[(i + j) % 2]);

            }

            System.out.println();

        }

    }

}
