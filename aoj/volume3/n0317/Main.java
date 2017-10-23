import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gole = sc.nextInt();
        int perBigJump = sc.nextInt();

        int bigJump = gole / perBigJump;
        int smallJump = gole % perBigJump;

        int jumpMin = bigJump + smallJump;

        System.out.println(jumpMin);

    }

}
