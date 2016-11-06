import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstPlayer = sc.next();
        int discsCount = 0;

        for (int i = 0; i < 8; i++) {

            String row = sc.next();

            for (int j = 0; j < 8; j++) {

                if (row.charAt(j) != '.') {
                    discsCount++;
                }

            }

        }

        if (firstPlayer.equals("oda")) {

            System.out.println(discsCount % 2 == 0 ? "oda" : "yukiko");

        } else if (firstPlayer.equals("yukiko")) {

            System.out.println(discsCount % 2 == 0 ? "yukiko" : "oda");

        }

    }

}
