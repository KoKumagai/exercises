import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong() + 1;

        StringBuilder LetterSequences = new StringBuilder();

        while (N > 0) {

            N--;
            LetterSequences.append((char) (N % 26 + 'A'));
            N /= 26;

        }

        for (int i = LetterSequences.length() - 1; i >= 0; i--) {
            System.out.print(LetterSequences.charAt(i));
        }

        System.out.println();

    }

}
