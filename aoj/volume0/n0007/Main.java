import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int week = sc.nextInt();
        int debt = 100000;
        double interest = 1.05;
        int roundUp = 1000;

        for (int i = 0; i < week; i++) {

            debt *= interest;

            if (debt % roundUp > 0) {
                debt += roundUp - (debt % roundUp);
            }

        }

        System.out.println(debt);

    }

}
