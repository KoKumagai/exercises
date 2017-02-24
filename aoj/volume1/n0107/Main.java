import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int depth = sc.nextInt();
            int width = sc.nextInt();
            int height = sc.nextInt();

            if (depth == 0 && width == 0 && height == 0) {
                return;
            }

            double hypotenusMin = Math.sqrt(depth * depth + width * width);
            hypotenusMin = Math.min(hypotenusMin, Math.sqrt(width * width + height * height));
            hypotenusMin = Math.min(hypotenusMin, Math.sqrt(depth * depth + height * height));

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                int radius = sc.nextInt();

                System.out.println(hypotenusMin < 2 * radius ? "OK" : "NA");

            }

        }

    }

}
