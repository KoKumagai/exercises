import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int problems = sc.nextInt();

        int[] scores = new int[problems];
        int[] peopleScores = new int[101];

        for (int i = 0; i < problems; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < problems; i++) {
            int personNo = sc.nextInt();
            peopleScores[personNo] += scores[i];
        }

        for (int i = 1; i < 101; i++) {

            if (peopleScores[0] < peopleScores[i]) {
                System.out.println("NO");
                return;
            }

        }

        System.out.println("YES");

    }

}
