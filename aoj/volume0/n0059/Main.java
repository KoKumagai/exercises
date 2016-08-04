import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            double xa1 = sc.nextDouble();
            double ya1 = sc.nextDouble();
            double xa2 = sc.nextDouble();
            double ya2 = sc.nextDouble();
            double xb1 = sc.nextDouble();
            double yb1 = sc.nextDouble();
            double xb2 = sc.nextDouble();
            double yb2 = sc.nextDouble();

            if ((xa1 <= xb2) && (xb1 <= xa2) && (ya1 <= yb2) && (yb1 <= ya2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}
