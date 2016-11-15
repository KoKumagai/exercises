import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCoordinates = sc.nextInt();

        Integer[]  coordinatesX = new Integer[numCoordinates];

        for (int i = 0; i < numCoordinates; i++) {
            coordinatesX[i] = sc.nextInt();
        }

        Arrays.sort(coordinatesX);

        int distanceMin = Integer.MAX_VALUE;

        for (int i = 0; i < numCoordinates - 1; i++) {

            if (0 < (coordinatesX[i + 1] - coordinatesX[i])) {
                distanceMin = Math.min(distanceMin, coordinatesX[i + 1] - coordinatesX[i]);
            }

        }

        if (distanceMin == Integer.MAX_VALUE) {
            distanceMin = 0;
        }

        System.out.println(distanceMin);

    }

}
