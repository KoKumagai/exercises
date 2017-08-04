import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rectangleCount = 0;
        int parallelogramCount = 0;

        while (sc.hasNext()) {

            String[] input = sc.next().split(",");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a * a + b * b == c * c) {
                rectangleCount++;
            }

            if (a == b) {
                parallelogramCount++;
            }

        }

        System.out.println(rectangleCount);
        System.out.println(parallelogramCount);

    }

}
