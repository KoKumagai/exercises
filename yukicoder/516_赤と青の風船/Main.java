import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < 3; i++) {

            String color = sc.next();

            if (color.equals("RED")) {
                redCount++;
            } else if (color.equals("BLUE")) {
                blueCount++;
            }

        }

        System.out.println(redCount > blueCount ? "RED" : "BLUE");

    }

}
