import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ball = "A";

        while (sc.hasNext()) {

            String[] input = sc.next().split(",");

            String change1 = input[0];
            String change2 = input[1];

            if (ball.equals(change1)) {
                ball = change2;
            } else if (ball.equals(change2)) {
                ball = change1;
            }

        }

        System.out.println(ball);

    }

}
