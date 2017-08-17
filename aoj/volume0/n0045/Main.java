import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPrice = 0;
        int totalQuantity = 0;
        int count = 0;

        while (sc.hasNext()) {

            String[] input = sc.next().split(",");

            int price = Integer.parseInt(input[0]);
            int quantity = Integer.parseInt(input[1]);

            totalPrice += price * quantity;
            totalQuantity += quantity;

            count++;

        }

        System.out.println(totalPrice);
        System.out.println(Math.round((double) totalQuantity / count));

    }

}
