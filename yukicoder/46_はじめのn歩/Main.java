import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int strideLength = sc.nextInt();
        int distanceWalking = sc.nextInt();

        int strideTotal = distanceWalking / strideLength;

        if (distanceWalking % strideLength > 0) {
            strideTotal++;
        }

        System.out.println(strideTotal);

    }

}
