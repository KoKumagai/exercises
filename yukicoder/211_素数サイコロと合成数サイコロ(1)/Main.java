import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] PRIME_NUMBERS_DICE = {2, 3, 5, 7, 11, 13};
        int[] COMPOSITE_NUMBERS_DICE = {4, 6, 8, 9, 10, 12};

        int K = sc.nextInt();

        int happeningCount = 0;

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if ((PRIME_NUMBERS_DICE[i] * COMPOSITE_NUMBERS_DICE[j]) == K) {
                    happeningCount++;
                }

            }

        }

        double probabilityK = (double) happeningCount / (PRIME_NUMBERS_DICE.length * COMPOSITE_NUMBERS_DICE.length);

        System.out.println(probabilityK);

    }

}
