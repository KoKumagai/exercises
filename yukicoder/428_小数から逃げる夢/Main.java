import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigDecimal D = new BigDecimal("0.1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071727374757677787980818283848586878889909192939495969798991");

        BigDecimal N = sc.nextBigDecimal();

        System.out.println(D.multiply(N));

    }

}
