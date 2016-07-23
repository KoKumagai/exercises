import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();
        double max = min;

        while (sc.hasNextDouble()) {

            double height = sc.nextDouble();

            if (height > max) {
                max = height;
            }

            if (height < min) {
                min = height;
            }

        }

        System.out.println(max - min);

    }

}
