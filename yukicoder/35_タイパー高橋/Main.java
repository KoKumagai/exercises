import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numSections = sc.nextInt();

        int numTypedTotal = 0;
        int numNotTypedTotal = 0;

        for (int i = 0; i < numSections; i++) {

            int timeRestriction = sc.nextInt();
            int possibleNumTyping = 12 * timeRestriction / 1000;

            String s = sc.next();
            int numLetters = s.length();

            int numTyped = Math.min(numLetters, possibleNumTyping);

            numTypedTotal += numTyped;
            numNotTypedTotal += numLetters - numTyped;

        }

        System.out.println(numTypedTotal + " " + numNotTypedTotal);

    }

}
