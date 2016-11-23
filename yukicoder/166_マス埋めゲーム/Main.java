import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long W = sc.nextLong();
        long N = sc.nextLong();
        long K = sc.nextLong();

        if ((H * W % N) == (K % N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
