import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] inputString = sc.next().toCharArray();

        int chiwawaRowMin = 101;

        for (int i = 0; i < inputString.length; i++) {

            char c = inputString[i];

            if (c != 'c') {
                continue;
            }

            int wCount = 0;

            for (int j = i + 1; j < inputString.length; j++) {

                if (inputString[j] == 'w') {
                    wCount++;
                }

                int chiwawaRow = j - i + 1;

                if (wCount == 2) {
                    chiwawaRowMin = Math.min(chiwawaRowMin, chiwawaRow);
                    break;
                }

            }

        }

        if (chiwawaRowMin == 101) {
            System.out.println(-1);
            return;
        }

        System.out.println(chiwawaRowMin);

    }

}
