import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int rate = sc.nextInt();

        int total = price + (price * rate / 100);

        System.out.println(total);

    }

}
