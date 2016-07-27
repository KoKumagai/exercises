import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            int numberOfTailZero = 0;

            for (int i = 5; i <= num; i *= 5) {
                numberOfTailZero += num / i;
            }

            System.out.println(numberOfTailZero);

        }

    }

}
