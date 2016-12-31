import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long D = sc.nextInt();

        long answer = A * B % D * C % D;

        System.out.println(answer);

    }

}
