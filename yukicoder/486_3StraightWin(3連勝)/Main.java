import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] winLossRecord = sc.next().toCharArray();

        char previous = ' ';
        int winCount = 0;

        for (int i = 0; i < winLossRecord.length; i++) {

            char current = winLossRecord[i];

            if (previous == current) {

                winCount++;

                if (3 <= winCount) {

                    switch (current) {

                        case 'O' :
                            System.out.println("East");
                            return;
                        case 'X' :
                            System.out.println("West");
                            return;

                    }

                }

            } else {

                previous = current;
                winCount = 1;

            }

        }

        System.out.println("NA");

    }

}
