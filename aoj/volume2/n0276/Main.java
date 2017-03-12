import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {

            int highest = sc.nextInt();
            int lowest = sc.nextInt();

            System.out.println(highest - lowest);

        }

    }

}
