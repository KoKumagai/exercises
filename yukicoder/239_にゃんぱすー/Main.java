import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();

        String[][] greetings = new String[people][people];

        for (int i = 0; i < people; i++) {

            for (int j = 0; j < people; j++) {
                greetings[i][j] = sc.next();
            }

        }

        int[] rengeCount = new int[people];

        for (int i = 0; i < people; i++) {

            for (int j = 0; j < people; j++) {

                if (greetings[i][j].equals("nyanpass")) {
                    rengeCount[j]++;
                }

            }

        }

        int renge = -1;

        for (int i = 0; i < people; i++) {

            if (rengeCount[i] == people - 1) {

                if (renge == -1) {
                    renge = i + 1;
                } else {
                    renge = -1;
                    break;
                }

            }

        }

        System.out.println(renge);

    }

}
