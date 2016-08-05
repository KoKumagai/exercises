import java.util.Scanner;

public class Main {

    private static final int NUMBER = 4;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int[] a = new int[NUMBER];
            int[] b = new int[NUMBER];

            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }

            int numberOfHits = 0;
            int numberOfBlows = 0;

            for (int i = 0; i < NUMBER; i++) {

                if (a[i] == b[i]) {

                    numberOfHits++;

                } else {

                    for (int j = 0; j < NUMBER; j++) {

                        if (b[i] == a[j]) {

                            numberOfBlows++;

                        }

                    }

                }

            }

            System.out.println(numberOfHits + " " + numberOfBlows);

        }

    }

}
