import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int numIceCreams[] = new int [10];

            for (int i = 0; i < n; i++) {
                numIceCreams[sc.nextInt()]++;
            }

            for (int i = 0; i < 10; i++) {

                if (numIceCreams[i] == 0) {
                    System.out.println("-");
                    continue;
                }

                for (int j = 0; j < numIceCreams[i]; j++) {
                    System.out.print("*");
                }

                System.out.println();

            }

        }

    }

}
