import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String correctAnswer = sc.next();
            String answer = sc.next();

            if (correctAnswer.equals("0") && answer.equals("0")) {
                break;
            }

            int hitCount = 0;
            int blowCount = 0;

            for (int i = 0; i < 4; i++) {

                if (correctAnswer.charAt(i) == answer.charAt(i)) {
                    hitCount++;
                    continue;
                }

                if (0 <= correctAnswer.indexOf(answer.charAt(i))) {
                    blowCount++;
                }

            }

            System.out.println(hitCount + " " + blowCount);

        }

    }

}
