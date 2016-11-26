import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();

        int[] spaces = new int[lines];

        int max = 0;

        for (int i = 0; i < lines; i++) {

            int space = sc.nextInt();
            int tab = sc.nextInt();

            spaces[i] = space + (4 * tab);

            max = Math.max(max, spaces[i]);

        }

        long ideographicSpaces = 0;

        for (int i = 0; i < lines; i++) {

            int requiredSpaces = max - spaces[i];

            if (requiredSpaces % 2 == 1) {
                System.out.println(-1);
                return;
            }

            ideographicSpaces += requiredSpaces / 2;

        }

        System.out.println(ideographicSpaces);

    }

}
