import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] scores = new int[6];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores);

        int scoreSum = 0;

        for (int i = 1; i < scores.length - 1; i++) {
            scoreSum += scores[i];
        }

        double socore = (double) scoreSum / 4;

        System.out.printf("%.2f\n", socore);

    }

}
