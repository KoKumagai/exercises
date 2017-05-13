import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long d = sc.nextLong();

        d *= 108;

        long integerPart = d / 100;
        long fractionalPart = d % 100;

        System.out.println(integerPart + "." + fractionalPart / 10 + fractionalPart % 10);

    }

}
