import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Card[] A = new Card[n];
        Card[] B = new Card[n];

        for (int i = 0; i < n; i++) {

            char p = sc.next().toCharArray()[0];
            int r = sc.nextInt();

            A[i] = new Card(p, r);
            B[i] = new Card(p, r);

        }

        quickSort(A, 0, n - 1);
        mergeSort(B, 0, n);

        System.out.println(isStable(A, B, n) ? "Stable" : "Not stable");

        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }

    }

    private static void quickSort(Card[] A, int p, int r) {

        if (p < r) {

            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);

        }

    }

    private static int partition(Card[] A, int p, int r) {

        int x = A[r].getNumber();

        int i = p - 1;

        for (int j = p; j < r; j++) {

            if (A[j].getNumber() <= x) {

                i++;
                Card temp = A[i];
                A[i] = A[j];
                A[j] = temp;

            }

        }

        Card temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return ++i;

    }

    private static void mergeSort(Card[] A, int left, int right) {

        if (left + 1 < right) {

            int mid = (left + right) / 2;

            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);

        }

    }

    private static void merge(Card[] A, int left, int mid, int right) {

        int n1 = mid - left;
        int n2 = right - mid;

        Card[] L = new Card[n1 + 1];
        Card[] R = new Card[n2 + 1];

        for (int i = 0; i < n1; i++){
            L[i] = A[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }

        L[n1] = new Card(' ', Integer.MAX_VALUE);
        R[n2] = new Card(' ', Integer.MAX_VALUE);

        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {

            if (L[i].getNumber() <= R[j].getNumber()) {

                A[k] = L[i];
                i++;

            } else {

                A[k] = R[j];
                j++;

            }

        }

    }

    private static boolean isStable(Card[] A, Card[] B, int n) {

        for (int i = 0; i < n; i++) {

            if (A[i].getSuit() != B[i].getSuit()) {
                return false;
            }

        }

        return true;

    }

}

class Card {

    private char suit;
    private int number;

    public Card(char suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public char getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%c %d", suit, number);
    }

}
