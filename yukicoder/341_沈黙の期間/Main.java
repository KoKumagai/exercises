import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputString = sc.next();

        int dotsCount = 0;
        int dotsMax = 0;

        for (int i = 0; i < inputString.length(); i++) {

            char c = inputString.charAt(i);

            if (c == '…') {
                dotsCount++;
                dotsMax = Math.max(dotsMax, dotsCount);
            } else {
                dotsCount = 0;
            }

        }

        System.out.println(dotsMax);

    }

}
