import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int perCalorie = sc.nextInt();

        double rIn = sc.nextInt();
        double rOut = sc.nextInt();

        double radius = (rOut - rIn) / 2;

        double surfaceArea = radius * radius * Math.PI;

        double centerGravity = (rOut + rIn) / 2;

        double volume = 2 * Math.PI * centerGravity * surfaceArea;

        System.out.println(volume * perCalorie);

    }

}
