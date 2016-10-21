import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialCircle =sc.nextInt();
        int numChange = sc.nextInt();

        int currentCircle = initialCircle;

        for (int i = 0; i < numChange; i++) {

            int from = sc.nextInt();
            int to = sc.nextInt();

            if (from == currentCircle) {

                currentCircle = to;

            } else if (to == currentCircle) {

                currentCircle = from;

            }

        }

        System.out.println(currentCircle);

    }

}
