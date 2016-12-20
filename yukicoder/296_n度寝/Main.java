import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int SLEEP_NUM = sc.nextInt();

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int TIME_INTERVAL = sc.nextInt();

        minute += (SLEEP_NUM - 1) * TIME_INTERVAL;

        hour += minute / 60;
        hour %= 24;
        minute = minute % 60;

        System.out.println(hour);
        System.out.println(minute);

    }

}
