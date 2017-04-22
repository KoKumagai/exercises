import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigDecimal v = sc.nextBigDecimal();
        BigDecimal t = sc.nextBigDecimal();

        BigDecimal distance = v.multiply(t);
        distance = distance.setScale(0, BigDecimal.ROUND_DOWN);

        System.out.println(distance);

    }

}
