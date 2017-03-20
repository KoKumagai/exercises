import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int tryingCount = 1;
            boolean canGetSameItem = false;

            for (int i = 0; i < n; i++) {

                int item = sc.nextInt();

                if (1 <= item) {
                    tryingCount++;
                }

                if (2 <= item) {
                    canGetSameItem = true;
                }

            }

            System.out.println(canGetSameItem ? tryingCount : "NA");

        }

    }

}
