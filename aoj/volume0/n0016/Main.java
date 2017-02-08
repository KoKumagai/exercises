import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter(",|\\n");

        double x = 0;
        double y = 0;

        int theta = 90;

        while (true) {

            int distance = sc.nextInt();
            int angle = sc.nextInt();

            if (distance == 0 && angle == 0) {
                break;
            }

            x += distance * Math.cos(Math.toRadians(theta));
            y += distance * Math.sin(Math.toRadians(theta));

            theta -= angle;

        }

        System.out.println((int) x);
        System.out.println((int) y);

    }

}
