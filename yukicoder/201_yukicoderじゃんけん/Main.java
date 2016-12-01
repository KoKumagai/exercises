import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nameA = sc.next();
        BigInteger yurufuwaPoingA = sc.nextBigInteger();
        sc.next();

        String nameB = sc.next();
        BigInteger yurufuwaPoingB = sc.nextBigInteger();
        sc.next();

        if (yurufuwaPoingA.compareTo(yurufuwaPoingB) == 0) {
            System.out.println(-1);
            return;
        }

        if (yurufuwaPoingA.compareTo(yurufuwaPoingB) > 0) {
            System.out.println(nameA);
        } else {
            System.out.println(nameB);
        }

    }

}
