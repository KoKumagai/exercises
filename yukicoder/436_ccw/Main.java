import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ccwString = sc.next();

        int cCount = 0;
        int wCount = 0;

        for (int i = 0; i < ccwString.length(); i++) {

            char ch = ccwString.charAt(i);

            if (ch == 'c') {
                cCount++;
            }

            if (ch == 'w') {
                wCount++;
            }

        }

        System.out.println(Math.min(cCount - 1, wCount));

    }

}
