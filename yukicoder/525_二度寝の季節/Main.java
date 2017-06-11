import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split(":");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        minute += 5;

        if (minute >= 60) {
            hour++;
            minute -= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.printf("%02d:%02d", hour, minute);

    }

}
