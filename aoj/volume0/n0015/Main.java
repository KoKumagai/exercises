import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            BigInteger first = new BigInteger(sc.next());
            BigInteger second = new BigInteger(sc.next());

            int firstLength = first.toString().length();
            int secondLength = second.toString().length();

            if (80 < firstLength || 80 < secondLength) {
                System.out.println("overflow");
                continue;
            }

            if (first.add(second).toString().length() <= 80) {
                System.out.println(first.add(second));
            } else {
                System.out.println("overflow");
            }

        }

    }

}
