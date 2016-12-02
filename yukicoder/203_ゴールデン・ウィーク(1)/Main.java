import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String twoWeeks = sc.next() + sc.next();

        int holidayCount = 0;
        int holidayMax = 0;

        for (int i = 0; i < twoWeeks.length(); i++) {

            if (twoWeeks.charAt(i) == 'o') {

                holidayCount++;

                if (holidayMax < holidayCount) {
                    holidayMax = holidayCount;
                }

            } else if (twoWeeks.charAt(i) == 'x') {

                holidayCount = 0;

            }

        }

        System.out.println(holidayMax);

    }

}
