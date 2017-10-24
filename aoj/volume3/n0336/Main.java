import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int radius = sc.nextInt();

        int sum = height + radius;

        if (sum == 0) {
            System.out.println(0);
        } else if (sum > 0) {
            System.out.println(1);
        } else if (sum < 0) {
            System.out.println(-1);
        }

    }

}
