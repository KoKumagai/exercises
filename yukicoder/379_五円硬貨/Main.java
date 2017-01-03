import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int YEN = sc.nextInt();
        int GAS = sc.nextInt();
        int VOLUME = sc.nextInt();

        int fiveYenCoins = YEN / 5;
        long sumGas = (long) fiveYenCoins * GAS;
        double concentrationGas = (double) sumGas / VOLUME;

        System.out.printf("%.11f\n", concentrationGas);

    }

}
