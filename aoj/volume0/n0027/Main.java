import java.util.Scanner;

public class Main {

    private static final int DAYS[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String WEEK_NAMES[] = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int month = sc.nextInt();
            int day = sc.nextInt();

            if (month == 0) {
                break;
            }

            for (int i = 0; i < month; i++) {
                day += DAYS[i];
            }

            System.out.println(WEEK_NAMES[day % 7]);

        }

    }

}
