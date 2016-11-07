import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double radius = Math.sqrt((x * x) + (y * y));

        int diameter = (int) Math.floor(2 * radius) + 1;

        System.out.println(diameter);

    }

}
