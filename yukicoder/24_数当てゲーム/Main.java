import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 10;
        final int NUM_TURN = sc.nextInt();

        boolean[] answer = new boolean[MAX];
        Arrays.fill(answer, true);

        for (int i = 0; i < NUM_TURN; i++) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();

            String included = sc.next();

            if ("YES".equals(included)) {

                for (int j = 0; j < MAX; j++) {

                    if (!(j == num1 || j == num2 || j == num3 || j == num4)) {
                        answer[j] = false;
                    }

                }

            } else if ("NO".equals(included)) {

                answer[num1] = false;
                answer[num2] = false;
                answer[num3] = false;
                answer[num4] = false;

            }

        }

        for (int i = 0; i < MAX; i++) {

            if (answer[i]) {

                System.out.println(i);
                break;

            }

        }

    }

}
