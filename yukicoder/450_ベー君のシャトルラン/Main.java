import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vl = sc.nextInt();
        int vr = sc.nextInt();
        int d = sc.nextInt();
        int w = sc.nextInt();

        System.out.println((double) d / (vl + vr) * w);

    }

}
