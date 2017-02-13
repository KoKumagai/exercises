import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            double velocity = sc.nextDouble();

            double time = velocity / 9.8;

            double fallDistance = 4.9 * time * time;

            int floorCount = 1;

            while (true) {

                double height = 5 * floorCount - 5;

                if (fallDistance <= height) {
                    System.out.println(floorCount);
                    break;
                }

                floorCount++;

            }

        }

    }

}
