import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        BigInteger sum = A.add(B);
        BigInteger product = A.multiply(B);

        switch (sum.compareTo(product)) {
            case -1 :
                System.out.println('P');
                return;
            case 0 :
                System.out.println('E');
                return;
            case 1 :
                System.out.println('S');
                return;
        }

    }

}
