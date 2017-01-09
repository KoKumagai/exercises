import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String[] romanNumerals = {"XII", "I", "II", "III", "IIII", "V", "VI", "VII", "VIII", "IX", "X", "XI"};

        String currentTimeRoman = sc.next();

        int currentTime = 0;

        for (int i = 0; i < romanNumerals.length; i++) {

            if (currentTimeRoman.equals(romanNumerals[i])) {
                currentTime = i;
            }

        }

        int timeLater = currentTime + sc.nextInt();

        timeLater = (timeLater % 12 + 12) % 12;

        System.out.println(romanNumerals[timeLater]);

    }

}
