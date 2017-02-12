import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            double xA = sc.nextDouble();
            double yA = sc.nextDouble();
            double rA = sc.nextDouble();

            double xB = sc.nextDouble();
            double yB = sc.nextDouble();
            double rB = sc.nextDouble();

            double hypotenuse = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));

            double radiusDiff = Math.abs(rA - rB);

            double radiusSum = rA + rB;

            if (hypotenuse < radiusDiff) {

                if (rA < rB) {
                    System.out.println(-2);
                } else {
                    System.out.println(2);
                }

            } else {

                if (radiusSum < hypotenuse) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }

            }

        }

    }

}
