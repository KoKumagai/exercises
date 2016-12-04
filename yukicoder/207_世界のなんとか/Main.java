import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int BEGIN = sc.nextInt();
        int END = sc.nextInt();

        for (int i = BEGIN; i <= END; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
                continue;
            }

            int j = i;

            while (j > 0) {

                if (j % 10 == 3) {
                    System.out.println(i);
                    break;
                }

                j /= 10;

            }

        }

    }

}
