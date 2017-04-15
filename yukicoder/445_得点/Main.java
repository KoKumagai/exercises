import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        long score = (long) (50 * A + (50 * A / (0.8 + 0.2 * B)));

        System.out.println(score);

    }

}
