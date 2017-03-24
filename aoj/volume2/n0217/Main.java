import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int id = 0;
            int distanceMax = 0;

            for (int i = 0; i < n; i++) {

                int idCurrent = sc.nextInt();
                int distance = sc.nextInt() + sc.nextInt();

                if (distanceMax < distance) {

                    id = idCurrent;
                    distanceMax = distance;

                }

            }

            System.out.println(id + " " + distanceMax);

        }

    }

}
