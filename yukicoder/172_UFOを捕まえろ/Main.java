import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = Math.abs(sc.nextInt());
        int y = Math.abs(sc.nextInt());
        int radius = sc.nextInt();

        int barrier = (int) Math.ceil(x + y + (Math.sqrt(2) * radius));

        System.out.println(barrier);

    }

}
