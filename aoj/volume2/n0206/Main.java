import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int expense = sc.nextInt();

            if (expense == 0) {
                break;
            }

            int takedMonths = 0;

            for (int i = 1; i <= 12; i++) {

                int income = sc.nextInt();
                int expenditure = sc.nextInt();

                expense -= income - expenditure;

                if (expense <= 0 && takedMonths == 0) {
                    takedMonths = i;
                }

            }

            System.out.println(takedMonths != 0 ? takedMonths : "NA");

        }

    }

}
