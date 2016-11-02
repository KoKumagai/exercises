import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int TWENTY_FOUR_HOURS = 24 * 60;

        int n = sc.nextInt();

        int sleepTimeTotal = 0;

        for (int i = 0; i < n; i++) {

            String[] time = sc.next().split(":");
            int hourGoBedTime = Integer.parseInt(time[0]);
            int minuteGoBedTime = Integer.parseInt(time[1]);

            time = sc.next().split(":");
            int hourWakeUpTime = Integer.parseInt(time[0]);
            int minuteWakeUpTime = Integer.parseInt(time[1]);

            int goBedTime = (hourGoBedTime * 60)  + minuteGoBedTime;
            int wakeupTime = (hourWakeUpTime * 60) + minuteWakeUpTime;

            sleepTimeTotal += (wakeupTime - goBedTime + TWENTY_FOUR_HOURS) % TWENTY_FOUR_HOURS;

        }

        System.out.println(sleepTimeTotal);

    }

}
