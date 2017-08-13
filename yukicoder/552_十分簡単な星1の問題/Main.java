import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        if (N.equals("0")) {
            System.out.println(N);
            return;
        }

        System.out.println(N + "0");

    }

}
