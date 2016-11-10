import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long stringLen = sc.nextInt();

        System.out.println((stringLen - 1) * (stringLen - 1) / 4);

    }

}
