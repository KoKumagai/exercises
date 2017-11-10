import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalScoreA = 0;
        int totalScoreB = 0;

        for (int i = 0; i < 4; i++) {
            totalScoreA += sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            totalScoreB += sc.nextInt();
        }

        System.out.println(totalScoreA > totalScoreB ? totalScoreA : totalScoreB);

    }

}
