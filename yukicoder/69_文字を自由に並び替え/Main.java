import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int NUM_LETTERS = 26;

        String A = sc.next();
        String B = sc.next();

        int[] letterCountA = new int[NUM_LETTERS];
        int[] letterCountB = new int[NUM_LETTERS];

        for (int i = 0; i < A.length(); i++) {

            letterCountA[A.charAt(i) - 'a']++;
            letterCountB[B.charAt(i) - 'a']++;

        }

        boolean isSame = true;

        for (int i = 0; i < NUM_LETTERS; i++) {

            if (letterCountA[i] != letterCountB[i]) {
                isSame = false;
                break;
            }

        }

        System.out.println(isSame? "YES" : "NO");

    }

}
