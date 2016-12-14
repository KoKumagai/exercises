import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int player1 = sc.nextInt();
        int player2 = sc.nextInt();

        if (player1 == player2) {
            System.out.println("Drew");
            return;
        }

        if ((player1 - player2 + 3) % 3 == 1) {
            System.out.println("Lost");
        } else {
            System.out.println("Won");
        }

    }

}
