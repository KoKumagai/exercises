import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int bigBonus = sc.nextInt();
            int regularBonus = sc.nextInt();
            int greap = sc.nextInt();
            int cherry = sc.nextInt();
            int star = sc.nextInt();
            int totalGame = sc.nextInt();

            if (bigBonus == 0 && regularBonus == 0 && greap == 0 && cherry == 0 && star == 0 && totalGame ==0) {
                break;
            }

            int medal = 100 + bigBonus * 15 + regularBonus * 15 + (bigBonus * 5 + regularBonus * 3) * 15 + greap * 7 + cherry * 2 - (bigBonus * 5 + regularBonus * 3) * 2 - (totalGame - bigBonus * 5 - regularBonus * 3 - star) * 3;

            System.out.println(medal);

        }

    }

}
