import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();

        int[] alphabetCount = new int[13];

        for (int i = 0; i < S.length; i++) {

            if (S[i] - 'a' >= 13) {
                System.out.println("Impossible");
                return;
            }

            alphabetCount[S[i] - 'a']++;

        }

        int zeroCount = 0;

        for (int i = 0; i < S.length; i++) {

            if (alphabetCount[i] == 0) {
                zeroCount++;
            }

        }

        if (zeroCount == 0) {

            for (int i = 0; i < S.length; i++) {
                System.out.println((char) (i + 'a'));
            }

        } else if (zeroCount == 1) {

            for (int i = 0; i < S.length; i++) {

                if (alphabetCount[i] == 0) {
                    System.out.println((char) (i + 'a'));
                }

            }

        } else if (zeroCount >= 2) {

            System.out.println("Impossible");

        }

    }

}
