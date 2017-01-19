import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        boolean isOkA = false;
        boolean isOkB = false;

        for (int i = 0; i <= 12345; i++) {

            if (A.equals(String.valueOf(i))) {
                isOkA = true;
            }

            if (B.equals(String.valueOf(i))) {
                isOkB = true;
            }

        }

        if (isOkA && isOkB) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

    }

}
