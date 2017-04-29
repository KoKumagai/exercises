import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigDecimal sum = new BigDecimal("0");

        for (int i = 0; i < n; i++) {

            BigDecimal a = sc.nextBigDecimal();

            sum = sum.add(a);

        }

        System.out.printf("%.10f", sum);

    }

}
