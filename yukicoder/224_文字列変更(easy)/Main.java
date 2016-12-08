import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int STRING_LEN = sc.nextInt();
        String STRING1 = sc.next();
        String STRING2 = sc.next();

        int changeCount = 0;

        for (int i = 0; i < STRING_LEN; i++) {

            if (STRING1.charAt(i) != STRING2.charAt(i)) {
                changeCount++;
            }

        }

        System.out.println(changeCount);

    }

}
