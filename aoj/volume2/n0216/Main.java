import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int waterUsed = sc.nextInt();

            if (waterUsed == -1) {
                break;
            }

            int cost = 1150;

            if (10 < waterUsed) {
                cost += Math.min((waterUsed - 10) * 125, 1250);
            }

            if (20 < waterUsed) {
                cost += Math.min((waterUsed - 20) * 140, 1400);
            }

            if (30 < waterUsed) {
                cost += (waterUsed - 30) * 160;
            }

            System.out.println(4280 - cost);

        }

    }

}
