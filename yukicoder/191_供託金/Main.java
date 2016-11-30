import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCandidates = sc.nextInt();

        int[] votes = new int[numCandidates];

        int votesTotal = 0;

        for (int i = 0; i < numCandidates; i++) {

            votes[i] = sc.nextInt();
            votesTotal += votes[i];

        }

        int votesOneTenth = votesTotal / 10;

        int candidatesPaidCount = 0;

        for (int i = 0; i < numCandidates; i++) {

            if (votes[i] <= votesOneTenth) {
                candidatesPaidCount++;
            }

        }

        int depositTotal = candidatesPaidCount * 30;

        System.out.println(depositTotal);

    }

}
