import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long zCount = N / 3;
        zCount += N / 5;
        zCount *= 2;

        System.out.println(zCount);

    }

}
