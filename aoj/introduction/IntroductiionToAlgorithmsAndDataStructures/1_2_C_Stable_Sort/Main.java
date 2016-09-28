import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Card[] cards = new Card[N];
        Card[] cardsForBubbleSort = new Card[N];
        Card[] cardsForselectionSort = new Card[N];

        for (int i = 0; i < N; i++) {
            String suiteAndnumber = sc.next();
            cards[i] = new Card(suiteAndnumber.charAt(0), Character.getNumericValue(suiteAndnumber.charAt(1)));
        }

        for (int i = 0; i < cards.length; i++) {
            cardsForBubbleSort[i] = cards[i].clone();
            cardsForselectionSort[i] = cards[i].clone();
        }

        bubbleSort(cardsForBubbleSort);
        selectionSort(cardsForselectionSort);

        print(cardsForBubbleSort);
        System.out.println("Stable");

        print(cardsForselectionSort);
        if (isStable(cardsForBubbleSort, cardsForselectionSort)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }

    }

    private static int bubbleSort(Card[] cards) {

        int numberOfSwapOperations = 0;
        boolean flag = true;

        while (flag) {

            flag = false;

            for (int i = cards.length - 1; i >= 1; i--) {

                if (cards[i].getNumber() < cards[i - 1].getNumber()) {

                    Card tmp = cards[i];
                    cards[i] = cards[i - 1];
                    cards[i - 1] = tmp;
                    flag = true;
                    numberOfSwapOperations++;

                }

            }

        }

        return numberOfSwapOperations;

    }

    private static int selectionSort(Card[] cards) {

        int numberOfSwapOperations = 0;

        for (int i = 0; i < cards.length - 1; i++) {

            int min = i;

            for (int j = i; j < cards.length; j++ ) {

                if (cards[j].getNumber() < cards[min].getNumber()) {
                    min = j;
                }

            }

            Card tmp = cards[i];
            cards[i] = cards[min];
            cards[min] = tmp;

            if (i != min) {
                numberOfSwapOperations++;
            }

        }

        return numberOfSwapOperations;

    }

    private static void print(Card[] cards) {

        for (int i = 0; i < cards.length; i++) {

            if (i != cards.length - 1) {
                System.out.print(cards[i].toString() + " ");
            } else {
                System.out.println(cards[i].toString());
            }

        }

    }

    private static boolean isStable(Card[] cards1, Card[] cards2) {

        for (int i = 0; i < cards1.length; i++) {

            if (cards1[i].getSuite() != cards2[i].getSuite()) {
                return false;
            }

        }

        return true;

    }

}

class Card {

    private char suite;
    private int number;

    public char getSuite() {
        return suite;
    }

    public int getNumber() {
        return number;
    }

    public Card(char suite, int number) {
        this.suite = suite;
        this.number = number;
    }

    @Override
    public String toString() {
        return suite + String.valueOf(number);
    }

    @Override
    public Card clone() {
        return new Card(this.suite, this.number);
    }

}
