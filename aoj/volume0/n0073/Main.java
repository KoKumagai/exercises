import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            double x = sc.nextDouble();
            double h = sc.nextDouble();

            if (x == 0 && h ==0) {
                break;
            }

            double heightTriangle = Math.sqrt(x * x / 4 + h * h);
            double areaTriangle = x * heightTriangle / 2;

            double areaSquare = x * x;

            double surfaceAreaCone = areaSquare + areaTriangle * 4.0;

            System.out.println(surfaceAreaCone);

        }

    }

}
