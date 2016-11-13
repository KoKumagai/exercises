import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCards = sc.nextInt();

        int numShuffling = sc.nextInt();

        int[] cards = new int[numShuffling];

        for (int i = 0; i < numShuffling; i++) {
            cards[i] = sc.nextInt();
        }

        int topCard = 1;

        for (int i = numShuffling - 1; i >= 0; i--) {

            if (topCard == 1) {

                topCard = cards[i];

            } else {

                if (topCard <= cards[i]) {
                    topCard--;
                }

            }

        }

        System.out.println(topCard);

    }

}
