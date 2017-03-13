import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {

            int ticket = sc.nextInt();
            int quantity = sc.nextInt();
            int amount = 0;

            switch (ticket) {

                case 1 :
                    amount = 6000 * quantity;
                    break;
                case 2 :
                    amount = 4000 * quantity;
                    break;
                case 3 :
                    amount = 3000 * quantity;
                    break;
                case 4 :
                    amount = 2000 * quantity;
                    break;

            }

            System.out.println(amount);

        }

    }

}
