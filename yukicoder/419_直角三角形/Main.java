import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double c;

        if (a == b) {
            c = Math.sqrt(a * a + b * b);
        } else {
            c = Math.sqrt(Math.abs(a * a - b * b));
        }

        System.out.println(c);

    }

}
