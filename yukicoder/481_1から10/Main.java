import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 9; i++) {

            int num = sc.nextInt();

            if (num != i) {
                System.out.println(i);
                return;
            }

        }

        System.out.println(10);

    }

}
