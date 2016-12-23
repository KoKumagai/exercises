import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {

            System.out.printf("%03d\n", i);

            if (sc.next().equals("unlocked")) {
                break;
            }

        }

    }

}
