import java.util.Scanner;

public class Main {

    private static String[] DAYS = {"thu", "fri", "sat", "sun", "mon", "tue", "wed"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String day = DAYS[sc.nextInt() % 7];

        System.out.println(day);

    }

}
