import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num100YenCoin = sc.nextInt();
        int num25YenCoin = sc.nextInt();
        int num1YenCoin = sc.nextInt();

        num25YenCoin += num1YenCoin / 25;
        num1YenCoin = num1YenCoin % 25;

        num100YenCoin += num25YenCoin / 4;
        num25YenCoin = num25YenCoin % 4;

        num100YenCoin = num100YenCoin % 10;

        int numCoinSum = num1YenCoin + num25YenCoin + num100YenCoin;

        System.out.println(numCoinSum);

    }

}
