import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int oneYenCoin = sc.nextInt();
        int fiveYenCoin = sc.nextInt() * 5;
        int tenYenCoin = sc.nextInt() * 10;
        int fiftyYenCoin = sc.nextInt() * 50;
        int oneHundredYenCoin = sc.nextInt() * 100;
        int fiveHundredYenCoin = sc.nextInt() * 500;

        int total = oneYenCoin + fiveYenCoin + tenYenCoin + fiftyYenCoin + oneHundredYenCoin + fiveHundredYenCoin;

        System.out.println(1000 <= total ? 1 : 0);

    }

}
