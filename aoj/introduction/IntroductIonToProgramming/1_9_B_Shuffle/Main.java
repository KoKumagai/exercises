import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String deck = sc.next();

            if (deck.equals("-")) {
                break;
            }

            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {

                int h = sc.nextInt();
                deck = deck.substring(h) + deck.substring(0, h);

            }

            System.out.println(deck);

        }

    }

}
