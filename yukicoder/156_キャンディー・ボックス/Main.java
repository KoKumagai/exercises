import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBoxes = sc.nextInt();
        int takingCandyTotal = sc.nextInt();
        int[] numCandies = new int[numBoxes];

        for (int i = 0; i < numBoxes; i++) {
            numCandies[i] = sc.nextInt();
        }

        Arrays.sort(numCandies);

        int numEmptyBoxes = 0;

        for (int i = 0; i < numBoxes; i++) {

            int numTakingCandy = Math.min(takingCandyTotal, numCandies[i]);

            numCandies[i] -= numTakingCandy;
            takingCandyTotal -= numTakingCandy;

            if (numCandies[i] == 0) {
                numEmptyBoxes++;
            }

        }

        System.out.println(numEmptyBoxes);

    }

}
