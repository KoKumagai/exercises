import java.util.Scanner;

public class Main {

    private static final int[] WEIGHTS = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            StringBuilder sb = new StringBuilder();

            int stuff = sc.nextInt();

            for (int i = 0; i < WEIGHTS.length; i++) {

                int and = stuff & WEIGHTS[i];

                if (and != 0) {
                    sb.append(WEIGHTS[i] + " ");
                }

            }

            System.out.println(sb.toString().trim());

        }

    }

}
