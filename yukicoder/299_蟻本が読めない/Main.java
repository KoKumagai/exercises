import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long EDITION = sc.nextLong();

        long page = 316;

        page += (EDITION - 1) * 52;

        System.out.println(page);

    }

}
