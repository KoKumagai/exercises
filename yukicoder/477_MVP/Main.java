import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        System.out.println(N / (K + 1) + 1);

    }

}
