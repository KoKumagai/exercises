import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int px = sc.nextInt();
        int py = sc.nextInt();
        int qx = sc.nextInt();
        int qy = sc.nextInt();

        System.out.println((double) (Math.abs(px - qx)) / 2 + (double) (Math.abs(py - qy)) / 2);

    }

}
