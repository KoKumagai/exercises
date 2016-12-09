import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] cardsCount = new int[14];

        for (int i = 0; i < 5; i++) {
            cardsCount[sc.nextInt()]++;
        }

        Arrays.sort(cardsCount);

        if (cardsCount[13] == 3 && cardsCount[12] == 2) {
            System.out.println("FULL HOUSE");
        } else if (cardsCount[13] == 3) {
            System.out.println("THREE CARD");
        } else if (cardsCount[13] == 2 && cardsCount[12] == 2) {
            System.out.println("TWO PAIR");
        } else if (cardsCount[13] == 2) {
            System.out.println("ONE PAIR");
        } else{
            System.out.println("NO HAND");
        }

    }

}
