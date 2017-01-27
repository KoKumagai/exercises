import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ducks = sc.nextInt();

        int[] x = new int[ducks];

        for (int i = 0; i < ducks; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        int diff = x[1] - x[0];

        if (diff == 0) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i < ducks; i++) {

            if (x[i] - x[i - 1] != diff) {
                System.out.println("NO");
                return;
            }

        }

        System.out.println("YES");

    }

}
