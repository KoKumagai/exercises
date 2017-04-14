import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        BigInteger sum = A.add(B);
        BigInteger product = A.multiply(B);

        BigInteger bigger;
        BigInteger smaller;

        if (sum.compareTo(product) < 0) {
            bigger = product;
            smaller = sum;
        } else {
            bigger = sum;
            smaller = product;
        }

        while (bigger.compareTo(BigInteger.ZERO) != 0) {

            BigInteger tmp = bigger;
            bigger = smaller.mod(tmp);
            smaller = tmp;

        }

        BigInteger gcd = smaller;

        System.out.println(gcd);

    }

}
