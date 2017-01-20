import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long[] f = new long[3];

        f[0] = sc.nextLong();
        f[1] = sc.nextLong();
        f[2] = f[0] ^ f[1];

        long n = sc.nextLong();

        System.out.println(f[(int) (n % 3)]);

    }

}
