import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numEnemys = sc.nextInt();

        int ItemsTotal[] = new int[10];

        for (int i = 0; i < numEnemys; i++) {

            int item1 = sc.nextInt();
            int item2 = sc.nextInt();
            int item3 = sc.nextInt();

            ItemsTotal[item1 - 1]++;
            ItemsTotal[item2 - 1]++;
            ItemsTotal[item3 - 1]++;

        }

        int powerUp = 0;
        int other = 0;

        for (int i = 0; i < 10; i++) {

            if (ItemsTotal[i] >= 2) {
                powerUp += ItemsTotal[i] / 2;
            }

            other += ItemsTotal[i] % 2;

        }

        int maxPowerUp = powerUp + (other / 4);

        System.out.println(maxPowerUp);

    }

}
