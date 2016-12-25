import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();

        if (P == (N * P)) {
            System.out.println("=");
        } else {
            System.out.println("!=");
        }

    }

}
