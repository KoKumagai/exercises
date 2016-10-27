import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int distancePerOpe = sc.nextInt();

        int operationCount = 0;

        if (x != 0) {
            operationCount = 1;
        }

        if (y < 0) {
            operationCount = 2;
        }

        operationCount += (Math.abs(x) + distancePerOpe - 1) / distancePerOpe;
        operationCount += (Math.abs(y) + distancePerOpe - 1) / distancePerOpe;

        System.out.println(operationCount);

    }

}
